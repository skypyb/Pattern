package com.skypyb.observer.myObserver;

/**
 * 具体主题
 */
public class ConcreteSubject extends Subject {

    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象(目标对象)状态发生改变,发送通知各所有观察者
        this.notifyAllObs();//通知
    }

}
