package com.skypyb.state;

import com.skypyb.state.homeState.BookedState;
import com.skypyb.state.homeState.CheckedinState;
import com.skypyb.state.homeState.FreeState;
import com.skypyb.state.homeState.State;

/**
 * 环境类，表示状态所处的环境，已初始化好所有的状态对象(public final 修饰，暴露给外部但不可变更)
 *
 * 外部调用者只需要操纵该类即可完成状态的变更，每当状态变更时其所维护的状态类都会动态改变，其细节对外隐藏
 *
 * @author pyb www.skypyb.com www.yibobo.top
 */
public class Context {

    private State state;//所维护的状态

    public final BookedState bookedState = new BookedState();
    public final CheckedinState checkedinState = new CheckedinState();
    public final FreeState freeState = new FreeState();



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
