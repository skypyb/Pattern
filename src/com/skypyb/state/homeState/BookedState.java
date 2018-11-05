package com.skypyb.state.homeState;

import com.skypyb.state.Context;

/**
 * 房间预订
 */
public class BookedState extends State {


    @Override
    public void free() {
        System.out.println("退房，行吧");
        super.context.setState(Context.FREE_STATE);
        super.context.free();
    }

    @Override
    public void booked() {
        System.out.println("已预订");
    }

    @Override
    public void checkedin() {
        super.context.setState(Context.CHECKEDIN_STATE);
        super.context.checkedin();
    }
}
