package com.skypyb.strategy.strategy;

public class GoldenVipStrategy implements VipStrategy {
    @Override
    public int recharge(int price) {
        System.out.println("高贵的黄金会员充钱得13倍钻");
        return price*13;
    }
}
