package com.skypyb.strategy;

import com.skypyb.strategy.strategy.VipStrategy;

/**
 * 上下文对象,用于管理算法
 * 负责和具体的策略类交互
 * 这样的话，具体的算法和直接的客户端调用分离了，使得算法可以独立于客户端独立的变化
 * @author pyb  www.yibobo.top www.skypyb.com
 */
public class VipContext {
    private VipStrategy vipStrategy;

    //构造器注入
    public VipContext(VipStrategy vipStrategy) {
        this.vipStrategy = vipStrategy;
    }

    //set注入
    public void setVipStrategy(VipStrategy vipStrategy) {
        this.vipStrategy = vipStrategy;
    }

    //氪金的方法
    public void getDiamond(int price){
        System.out.println(new StringBuffer("您充钱")
                .append(price)
                .append("元")
                .append(",共获得:")
                .append(vipStrategy.recharge(price))
                .append("钻，下次再来氪哦")
        );
    }
}
