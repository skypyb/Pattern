package com.skypyb.state.homeState;

/**
 * 表示房间空闲状态
 */
public final class FreeState extends State {

    //切换到空闲状态时会触发的方法
    @Override
    public void free() {
        System.out.println("空闲状态~");
    }

    @Override
    public void booked() {//空闲状态下进行切换到预定操作
        super.context.setState(super.context.bookedState);
        super.context.getState().booked();
    }

    @Override
    public void checkedin() {//空闲状态下进行切换到入住操作，没预定当然是不能入住的啦
        System.out.println("没预定你住你马呢?");
    }
}
