package com.appleyk.DMA6_适配器模式;

import com.appleyk.DMA6_适配器模式.DM6.Mp3;
import com.appleyk.DMA6_适配器模式.DM6.Player;
import com.appleyk.DMA6_适配器模式.DM6.CAdapter类.QQPlayer;
import com.appleyk.DMA6_适配器模式.DM6.IAdapter接口.APlayer;
import com.appleyk.DMA6_适配器模式.DM6.IAdapter接口.AbstractPlayer;
import com.appleyk.DMA6_适配器模式.DM6.IAdapter接口.BPlayer;
import com.appleyk.DMA6_适配器模式.DM6.IAdapter接口.CPlayer;
import com.appleyk.DMA6_适配器模式.DM6.OAdapter对象.BaoFengPlayer;

/**
 * <p>适配器模式测试 </p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 2018年11月10日11:08:26
 * @Version V.1.0.1
 */
public class AdapterTest {

	public static void main(String[] args){
		
		// 使用类适配器
		useAdapterOfClass();	
		
		// 使用对象适配器
		useAdapterOfObject();	
		
		// 使用接口适配器
		useAdapterOfInterFace();
		
		/**
		 * 类适配器:当一个类A想拥有某个接口I里的所有功能时，却又懒得实现接口中的M方法时
		 *        则可以专门定义一个类B，B中的方法和接口I中的M方法保持一致，只不过B中的M方法已经通过定制进行了功能实现
		 *        这时候，我们称B是一个待适配的类，而B中的M方法我们称原方法，接口I中的M方法称作目标方法
		 *        A类我们则称呼为真正要适配的类，这个类通过继承B类、实现接口I即可具有目标接口I中的所有功能
		 *        正如一开始说的，适配的类A,懒得实现接口I中的M方法，怎么办，那我们就专门给A开个小灶，交给B类来做就好了
		 * 
		 * 对象适配器:其实和类适配器差不多，唯一的区别就是，类适配器无法对B类进行实例化，不够灵活，而对象适配器中
		 *         则将B类的实例放在了真正适配的类中，不管是内部还是外部，都可以实例化B对象，实现不同B对象的原始方法
		 *       
		 * 接口适配器:类适配和对象适配器有个不好的地方就是，适配器对象必须实现接口I中的所有功能
		 *         但现实是，我有时候不太想要I中的某些功能，怎么办？
		 *         比如A对象只实现I中的M方法，B对象只实现I中的N方法，而C对象则全部实现I中的M、N、P方法
		 *         这时候就需要借助抽象类Ab了，Ab实现接口I，抽象类和接口的区别就是，抽象类中的方法无需都实现，
		 *         而接口中的方法必须全部实现，这样一来，我们适配的类就可以通过只继承Ab类来实现接口I中的部分功能了
		 *         
		 *       项目中，具体用到哪种模式的适配器，可以好好斟酌一下了
		 *   
		 */
		
	}

	private static void useAdapterOfClass() {
		// 类适配器模式测试 == 持有类Mp3的原始方法，但是不能创建该类的实例
		Player qqPlayer = new QQPlayer();
		qqPlayer.playMusics();
		qqPlayer.playMVs();
		qqPlayer.playMovies();	
		System.out.println("============分割线");
	}
	
	private static void useAdapterOfObject() {
		// 对象适配器模式测试 == 持有类Mp3的原始方法，但是可以创建不同的Mp3类的实例
		Mp3 sonyMp3 = new Mp3("索尼（SONY） NW-ZX300A");
		Player bfPlayer = new BaoFengPlayer(sonyMp3);
		bfPlayer.playMusics();
		bfPlayer.playMVs();
		bfPlayer.playMovies();		
		System.out.println("=========暴风影音升级");
	
		// 暴风音影升级，改用纽曼的Mp3播放音乐功能
		Mp3 newsMyMp3 = new Mp3("纽曼（Newsmy）F35");
		((BaoFengPlayer)bfPlayer).setMp3(newsMyMp3);
		bfPlayer.playMusics();
		bfPlayer.playMVs();
		bfPlayer.playMovies();
		System.out.println("============分割线");
	}
	
	private static void useAdapterOfInterFace() {
		// 接口适配模式测试 == 适配类无需实现接口里面的所有方法，这时候需要借助一个抽象类进行一下过度
		AbstractPlayer aPlayer = new APlayer();
		aPlayer.show();
		
		AbstractPlayer bPlayer = new BPlayer();
		bPlayer.show();
		
		AbstractPlayer cPlayer = new CPlayer();
		cPlayer.show();
	}
}
