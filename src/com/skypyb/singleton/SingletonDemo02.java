package com.skypyb.singleton;

/**
 * 测试懒汉式的单例模式
 * @author pyb www.yibobo..top
 */
public class SingletonDemo02 {
    //类初始化时，并不初始化对象，延时加载，真正要用的时候在加载
    private static SingletonDemo02 s;

    private SingletonDemo02(){}//私有化构造器

    //在调用getInstance()方法时，在判定new不new
    //方法同步，调用效率较低
    public static synchronized SingletonDemo02 getInstance(){
        if (s == null){
            s = new SingletonDemo02();
        }
        return s;
    }
}
