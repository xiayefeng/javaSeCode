package com.atguigu07._abstract;

public abstract class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat(); // 抽象方法
    public void sleep() {
        System.out.println("人睡觉");
    }
}
