package com.skypyb.observer.javaObserver;

import java.util.Observable;
import java.util.Observer;

//继承java提供的观察者接口
public class ObserverA implements Observer {

    private int myState;

    /**
     * @param o   主题对象
     * @param arg   传过来的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        this.myState = (int) arg;
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
