package com.appleyk.DMB17_责任链.DM17.model;

/**
 * <p>键盘</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 2:02 2018-11-6
 * @version V.0.1.1
 */
public class KeyBord extends AbstractObject{

    /**
     * 键盘类型
     */
    private String type;

    public KeyBord(String type){
        this.type  = type;
    }
    
 
    /**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	@Override
    public void show() {
        System.out.println("键盘");
    }
}
