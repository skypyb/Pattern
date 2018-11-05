package com.skypyb.state;

import com.skypyb.state.homeState.BookedState;
import com.skypyb.state.homeState.CheckedinState;
import com.skypyb.state.homeState.FreeState;
import com.skypyb.state.homeState.State;

/**
 * 环境类，表示状态所处的环境
 */
public class Context {

    private State state;//所维护的状态

    public static final BookedState BOOKED_STATE = new BookedState();
    public static final CheckedinState CHECKEDIN_STATE = new CheckedinState();
    public static final FreeState FREE_STATE = new FreeState();

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);//将自身设置到所维护的 state中
    }

    //下面仨是客户端进行状态改变时的实际会调用的方法
    //客户端将完全和具体的状态变更隔离，符合迪米特法则
    public void free() {
        this.state.free();
    }

    public void booked() {
        this.state.booked();
    }

    public void checkedin() {
        this.state.checkedin();
    }


}
