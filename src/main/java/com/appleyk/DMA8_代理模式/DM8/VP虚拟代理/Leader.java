package com.appleyk.DMA8_代理模式.DM8.VP虚拟代理;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>领导 == 实现签订接口</p>
 *
 * @author Appleyk
 * @version v0.1.1
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 2018年11月10日 - 下午8:49:38
 */
public class Leader implements Signable {

    {
        System.out.println("各位久等了，我来了！");
    }

    /**
     * 合同列表
     */
    private List<String> deals;

    public Leader() {
        deals = new LinkedList<>();
    }

    public List<String> getDeals() {
        return deals;
    }

    public void setDeals(List<String> deals) {
        this.deals = deals;
    }

    public void addDeal(String deal) {
        this.deals.add(deal);
    }

    public void addDeals(List<String> deals) {
        this.deals.addAll(deals);
    }

    @Override
    public void sign() {
        Collections.sort(this.deals);
        for (String deal : deals) {
            System.out.println("领导签订了合同：" + deal);
        }
        System.out.println();
    }

}
