package com.skypyb.state.homeState;

import com.skypyb.state.Context;

/**
 * state 模式核心父接口，所有状态继承该类
 *
 * @author pyb www.skypyb.com www.yibobo.top
 */
public abstract class State {

    //维护一个Context环境，目的是能够让子类操纵，以达到状态动态变换的效果
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void free();
    public abstract void booked();
    public abstract void checkedin();
}
