package com.skypyb.strategy;

/**
 * 实现起来比较容易，但是代码过于丑陋
 * 如果算法特别复杂并且类型特别多则修改麻烦
 * 不符合开闭原则
 *
 * @author pyb  www.yibobo.top
 * www.skypyb.com
 * @time 2018-11-03
 */
public class TestOne {
    public double recharge(String type, double price) {
        if ("白嫖用户".equals(type)) {
            System.out.println("白嫖用户充钱得10倍钻");
            return price * 10;
        } else if ("会员".equals(type)) {
            System.out.println("高贵的会员充钱得12倍钻");
            return price * 12;
        } else if ("黄金会员".equals(type)) {
            System.out.println("高贵的黄金会员充钱得13倍钻");
            return price * 13;
        }
        return 0;
    }
}
