package com.skypyb.observer.javaObserver;

import java.util.Observable;

//目标对象，使用java提供的方式
public class ConcreteSubject extends Observable {

    private int state = 1;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        setChanged();//表示目标对象已经做了更改
        notifyObservers(state);//通知所有观察者
    }



}
