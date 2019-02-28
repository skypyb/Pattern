package com.skypyb.singleton;

/**
 * 测试静态内部类式的单例模式
 * 这种方式线程安全、调用效率高且实现延时加载。需要延时加载时，静态内部类式好于懒汉式
 * @author pyb www.skypyb.com
 */
public class SingletonDemo03 {

    private SingletonDemo03(){}//私有化构造器

    //类加载的过程天然线程安全
    private static class SingletonClassInstance{
        private static final SingletonDemo03 instance = new SingletonDemo03();
    }
    //无需同步，且用到时才会创建出对象。兼顾并发效率与延时加载
    public static SingletonDemo03 getInstance(){
        return SingletonClassInstance.instance;
    }

}
