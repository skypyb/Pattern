package com.skypyb.strategy.strategy;

public class NormalVipStrategy implements VipStrategy {
    @Override
    public int recharge(int price) {
        System.out.println("高贵的会员充钱得12倍钻");
        return price*12;
    }
}
