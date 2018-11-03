package com.skypyb.strategy.strategy;

public class NormalStrategy implements VipStrategy {

    @Override
    public int recharge(int price) {
        System.out.println("白嫖用户充钱得10倍钻");
        return price * 10;
    }
}
