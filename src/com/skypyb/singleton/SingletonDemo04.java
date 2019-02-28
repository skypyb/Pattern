package com.skypyb.singleton;

/**
 * 测试枚举式的单例模式
 * 由于枚举本身就是个单列，这种方式线程安全、调用效率高
 * 但不能实现延时加载。在不需要延时加载的情况下枚举类好于饿汉式（但枚举用的人少）
 * @author pyb www.skypyb.com
 */
public enum SingletonDemo04 {

    INSTANCE;


    //下面就随便写这个类的方法

}
