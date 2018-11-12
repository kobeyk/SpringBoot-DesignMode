package com.appleyk;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * <p>单元测试</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 2018年11月10日 - 下午9:33:26
 * @Version V.1.0.1
 */
public class TestA {

	@Test
	public void A(){
		
		List<String> deals = new LinkedList<>();
		deals.add("合同4");
		deals.add("合同2");
		Collections.sort(deals);
		for (String deal : deals) {
			System.out.println(deal);
		}
	}
}
