package com.skypyb.builder;

public class Client {
    public static void main(String[] args) {
        Person p1 = new Person.Builder("张三三", '女')
                .age(18)
                .job("java开发")
                .nationality("中国")
                .bulider();
        System.out.println(p1);



        Person p2 = new Person.Builder("刘老五", '男')
                .job("三和大神")
                .nationality("中国")
                .bulider();

        System.out.println(p2);
    }
}
