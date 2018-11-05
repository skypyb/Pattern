package com.skypyb.state.homeState;

import com.skypyb.state.Context;

public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void free();
    public abstract void booked();
    public abstract void checkedin();
}
