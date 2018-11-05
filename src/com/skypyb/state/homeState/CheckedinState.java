package com.skypyb.state.homeState;

import com.skypyb.state.Context;

/**
 * 房间入住
 */
public class CheckedinState extends State {


    @Override
    public void free() {
        System.out.println("退房，行吧");
        super.context.setState(Context.FREE_STATE);
        super.context.getState().free();
    }

    @Override
    public void booked() {
        System.out.println("住进去了还改为预定?怕不是傻子");
    }

    @Override
    public void checkedin() {
        System.out.println("已入住");
    }
}
