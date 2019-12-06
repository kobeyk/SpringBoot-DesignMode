package com.appleyk.DMA8_代理模式.DM8.VP虚拟代理;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>领导身边的秘书 == 将领导作为被代理的对象，但是会延缓被代理对象的创建时间，最后实现签订接口</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午8:54:45
 * @version V.0.1.1
 */
public class Secretary implements Signable{

	/**
	 * 合同列表 == 当领导在的时候，这个合同列表会递交给老板，反之，则先放在秘书这里
	 */
	private List<String> deals;
	private Leader leader;
	
	public Secretary() {
		this.deals = new LinkedList<>();
	}
	
	/**
	 * 添加一份合同
	 */
	public void addDeal(String deal){
		
		// 如果领导不在的话，秘书先揽收
		if(leader == null){
			this.deals.add(deal);
			System.out.println("秘书揽收了合同："+deal);
		}else{
			// 否则，直接递交给领导
			this.leader.addDeal(deal);
			System.out.println("领导亲自揽收了合同："+deal);
		}
	}
	
	@Override
	public void sign() {
		if(leader == null){
			System.out.println("领导不在，请稍等");
		}else{
			// 否者的话，领导将秘书揽收的合同拿过来
			this.leader.addDeals(this.deals);
			this.leader.sign();
		}		
	}
	
	static class LeaderFactory{
		public static Leader getLeader(){
			return new Leader();
		}
	}
	
	public void initLeader(int second){
		int n = 0;
		do{
			System.out.println("等待领导出现："+(++n)+"秒");
		}while(--second>0);
		this.leader = LeaderFactory.getLeader();
	}

}
