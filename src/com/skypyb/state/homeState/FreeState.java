package com.skypyb.state.homeState;

import com.skypyb.state.Context;

/**
 * 房间空闲
 */
public class FreeState extends State {

    @Override
    public void free() {
        System.out.println("空闲状态~");
    }

    @Override
    public void booked() {//预定操作
        super.context.setState(Context.BOOKED_STATE);
        super.context.getState().booked();
    }

    @Override
    public void checkedin() {
        System.out.println("没预定你住你马呢?");
    }
}
