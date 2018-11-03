package com.skypyb.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonDemo01 s1 = SingletonDemo01.getInstance();
        SingletonDemo01 s2 = SingletonDemo01.getInstance();

        System.out.println(s1==s2);//结果为true
    }
}
