package com.skypyb.strategy;


import com.skypyb.strategy.strategy.GoldenVipStrategy;
import com.skypyb.strategy.strategy.NormalStrategy;
import com.skypyb.strategy.strategy.VipStrategy;

/**
 * 我这实现的策略模式中业务只是最简化的，此时可能还不如 if..else
 * 毕竟创建了这么多类，相比起 if..else 来说难以管理
 *
 * 但是在实际生产中一个策略可能就会有好几百行代码，这个时候用此模式就会比较舒服
 * 根据需求来确定到底执行哪个策略。、还可以和 factory 模式结合起来一起使用
 *
 *
 */
public class TestStrategy {

    public static void main(String[] args) {
        VipStrategy vs1 = new NormalStrategy();//选择需要的策略类
        VipContext context = new VipContext(vs1);//实例化上下文对象
        context.getDiamond(648);//氪金

        System.out.println();

        context.setVipStrategy(new GoldenVipStrategy());
        context.getDiamond(648);
    }
}
