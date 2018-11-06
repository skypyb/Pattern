package com.skypyb.state.homeState;


/**
 * 表示房间预订状态
 */
public final class BookedState extends State {


    @Override
    public void free() {//预定状态下进行切换到空闲操作
        System.out.println("退房，行吧");
        super.context.setState(super.context.freeState);
        super.context.free();
    }

    @Override
    public void booked() {//切换到房间预订状态时会触发的方法
        System.out.println("已预订");
    }

    @Override
    public void checkedin() {//预定状态下进行切换到入住操作
        super.context.setState(super.context.checkedinState);
        super.context.checkedin();
    }
}
