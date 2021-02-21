package com.appleyk.DMB17_责任链.DM17;

import com.appleyk.utils.IdsMaker;

/**
 * <p>抽象任务链</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:56 2018-11-6
 * @version V.0.1.1
 */
public abstract class AbstractHandler <TData,TFilter>{

    protected IdsMaker idsMaker = new IdsMaker(1,31);
    /**
     * 任务链传递的数据【消费数据And最终数据】
     */
    protected TData data;

    /**
     * 当前任务的下一个任务链，即当前任务执行完成后，交给它下面的任务链继续执行，直到nextHandler == null
     */
    protected  AbstractHandler<TData,TFilter> nextHandler = null;

    /**
     * 抽象过滤器方法 == 具体实现交由具体的任务类执行，参数是具体的查询过滤器
     * @param filter 过滤器对象
     * @return TData
     */
    public abstract TData filter(TFilter filter);

    public TData getData() {
        return data;
    }

    public void setData(TData data) {
        this.data = data;
    }

    public AbstractHandler<TData,TFilter> getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler<TData,TFilter> nextHandler) {
        this.nextHandler = nextHandler;
    }

    public  static <TFilter> Object process(AbstractHandler handler , TFilter filter){

        AbstractHandler nextHandler   = handler;
        Object data = handler.getData();
        do{
            nextHandler.setData(data);
            data = nextHandler.filter(filter);
            nextHandler = nextHandler.getNextHandler();
        }while (nextHandler !=null);

        return  data;
    }

}
