package com.skypyb.builder;

public class Person {

    private final int id;
    private final String name;
    private final char sex;
    private final Integer age;
    private final String nationality;
    private final String job;

    public static class Builder {

        //必要的属性
        private final String name;
        private final char sex;

        private static int id = 0;//自增长的唯一标识

        //不是必要的属性
        private String nationality = null;
        private Integer age = null;
        private String job = "无业";


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

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        //创建对象
        public Person bulider() {
            this.id++;
            if (age == null) throw new IllegalStateException("id为:"+this.id+"的人没有年龄！");
            return new Person(this);
        }

    }

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
        this.nationality = builder.nationality;
        this.job = builder.job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
