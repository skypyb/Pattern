package com.skypyb.singleton;

/**
 * double check
 * 双重检测锁
 * 性能 安全 两开花
 */
public class SingletonDemo05 {
    private static volatile SingletonDemo05 instance = null;


    public static SingletonDemo05 getInstance() {

        if (instance == null) {
            synchronized (SingletonDemo05.class) {
                if (instance == null) {
                    instance = new SingletonDemo05();
                }
            }
        }
        return instance;
    }

    private SingletonDemo05() {
    }
}
