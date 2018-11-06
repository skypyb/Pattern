package com.skypyb.state.homeState;


/**
 * 表示房间入住状态
 */
public final class CheckedinState extends State {


    @Override
    public void free() {//入住状态下进行切换到空闲操作
        System.out.println("退房，行吧");
        super.context.setState(super.context.freeState);
        super.context.getState().free();
    }

    @Override
    public void booked() {//预定状态下进行切换到空闲操作，这里我让其不能变更状态
        System.out.println("住进去了还改为预定?怕不是傻子");
    }

    @Override
    public void checkedin() {//切换到入住状态时会执行的方法
        System.out.println("已入住");
    }
}
