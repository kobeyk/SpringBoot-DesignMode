package com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通;

import com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal.AbstractFeline;
import com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal.Cat;
import com.appleyk.DMB20_状态模式.DM20.猫科A_继承_普通.animal.Lion;

/**
 * <p>猫 == 就是我们家养的猫</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date created on 11:28 2019/12/6
 * @version V.0.1.1
 */
public class FelineTestA {

    public static void main(String[] args) {
        catDisplay();
        System.out.println("=======================");
        lionDisplay();
    }

    private static void catDisplay(){
        AbstractFeline feline = new Cat();
        feline.climbing();
        feline.swimming();
    }

    private static void lionDisplay(){
        AbstractFeline feline = new Lion();
        feline.climbing();
        feline.swimming();
    }

    /**
     * 思考：
     *
     * 《
     *      我们本来想抽离出一个猫科动物共有的Feline类，想当然的认为所有的猫科动物
     *      都会爬树、游泳，但是我们考虑的太不细致了，并不是所有的猫科动物都如Feline
     *      类定义的那样，会爬树和游泳，如果用继承的话，子类不会游泳怎么办？
     *      好办：
     *      （1）重写超类Feline的swimming方法即可。比如猫怕水不会游泳那就重写让猫不会游泳得了。
     *           如果子类太多，是不是每一种在Feline超类中定义的方法基本上不满足实际情况的都要
     *           被override？【请思考】
     *      （2）继续将超类Feline进行拆分，比如再拆分出来四个子抽象类，什么会爬树的猫科类、
     *           不会爬树的猫科类以及会游泳和不会游泳的猫科类...etc，我去，是个合格的程序员
     *           看到这种解决方案就头大，那么麻烦，也太不灵活了吧！如果某一对象可以改变的行为
     *           有很多种，那我岂不是要针对每一种行为都抽离出一个单独的类来？
     *   》
     *
     * 再思考：
     *
     * 《
     *      既然以上两种方法都不ok，那什么才是ok的呢？
     *      题外话，现实编码中，我们总以为面向对象的编程大多是基于继承来实现的，所以我们往往总是
     *      习惯性的想用继承来实现对象改变的部分（比如的重写父类行为），实际上，我们可以将对象改变
     *      的部分抽离出来，用组合的方式来实现！
     *
     *      正所谓设计的三大原则：
     *      （1）找出应用中可能需要变化的地方，把他们独立出来
     *      （2）针对接口编程，而不是针对实现
     *           备注：（针对接口编程其实就是多态的实现）最简单的理解就是：
     *                 A、接口是一个抽象，关注点在于"谁来做"，而实现则是具体的"我来做"，把谁定死了！
     *                 B、针对接口编程可以实现解耦，谁来实现我不关心，而针对实现则是彻底的死绑定，就你了！
     *                 C、伪代码举例：
     *
     *                    // 播放器
     *                    interface IPlayer{ void play(); }
     *
     *                    class Mp3Player impl IPlayer{
     *                        public void play(){print("Mp3播放")}
     *                    }
     *
     *                    class QQPlayer impl IPlayer{
     *                        public void play(){print("QQ播放")}
     *                     }
     *
     *                    class PlayAction_针对接口{
     *
     *                      public void play(IPlayer player){
     *                           //具体是谁，我不关心，使用者来决定，扩展性强！
     *                           player.play();
     *                      }
     *
     *                      void main(){
     *                          PlayAction action = new PlayAction()
     *                          action.play(new QQPlayer());
     *                          action.play(new Mp3Player());
     *                          action.play(我想传谁就传谁);
     *                      }
     *
     *                    }
     *
     *                    class PlayAction_针对实现{
     *
     *                      public void mp3Play(Mp3Player mp3){
     *                           //这个就是mp3播放，你使用者必须按我的要求来
     *                           mp3.play();
     *                      }
     *
     *                      public void qqPlay(QQPlayer qq){
     *                           //这个就是qq播放，就是qq播放，就是qq播放，重要的事情说三遍！
     *                           qq.play();
     *                      }
     *
     *                      void main(){
     *                          PlayAction action = new PlayAction()
     *                          action.mp3Play(new Mp3Player());
     *                          action.qqPlay(new QQPlayer());
     *                          //如果我想增加一种播放器，是不是就有点扯淡了，怎么搞？扩展性在哪？
     *                          action.其他Play(new 其他Player());
     *                      }
     *
     *                    }
     *
     *      （3）少用继承，多用组合
     *           备注： 如果没讲上面猫科动物的案例时，你可能对为什么"少用继承"不是很理解，
     *                  现在是不是觉得"少用继承"还是有那么点意思的,那"多用组合"又是怎么回事呢？
     *                  下面请转到【猫科B_组合_状态模式】
     *
     *  》
     *
     */

}
