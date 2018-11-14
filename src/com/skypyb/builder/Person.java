package com.skypyb.builder;

import java.util.Arrays;

public class Person {
    //均为不可变参数，线程安全
    private final int id;
    private final String name;
    private final char sex;
    private final Integer age;
    private final String nationality;
    private final String[] job;

    //只能通过builder创建对象
    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.nationality = builder.nationality;
        this.age = builder.age;
        this.job = builder.job;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String[] getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", job=" + Arrays.toString(job) +
                '}';
    }

    //Person类的构建者
    public static class Builder {

        //必要的属性
        private final String name;
        private final char sex;

        private static int id = 0;//自增长的唯一标识

        //不是必要的属性
        private String nationality = null;
        private Integer age = 0;
        private String[] job = {"无业"};


        public Builder(String name, char sex) {
            if (name == null || (sex != '男' && sex != '女'))
                throw new IllegalArgumentException();

            this.name = name;
            this.sex = sex;
        }

        public Builder nationality(String nationality) {
            this.nationality = nationality;
            return this;
        }

        public Builder age(int age) {
            if (age > 200) throw new IllegalArgumentException(name+"年龄太大！年龄为:"+age);
            this.age = age;
            return this;
        }

        public Builder job(String...job) {
            this.job = job;
            return this;
        }

        //创建对象的方法
        public Person bulider() {
            this.id++;
            return new Person(this);
        }

    }


}
