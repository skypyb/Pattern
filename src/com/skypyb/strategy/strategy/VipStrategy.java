package com.skypyb.strategy.strategy;

/**
 * vip氪金得钻的算法策略接口
 */
public interface VipStrategy {

    /**
     * 实现类实现该方法以执行不同的算法
     */
    int recharge(int price);


}
