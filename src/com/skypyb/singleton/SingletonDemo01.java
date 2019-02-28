package com.skypyb.singleton;

/**
 * 测试饿汉式的单例模式
 * @author pyb www.skypyb.com
 */
public class SingletonDemo01 {
    //类初始化时，立即加载对象！由于加载类时线程是天然安全的
    private static SingletonDemo01 s = new SingletonDemo01();

    private SingletonDemo01(){}//私有化构造器
    //方法没有同步，效率高！
    public static SingletonDemo01 getInstance(){
        return s;
    }


}
