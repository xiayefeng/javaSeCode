package com.atguigu07._abstract;

public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void eat(){
        System.out.println("学生多吃有营养养的食物");
    }
    public void sleep() {
        System.out.println("学生要保证充足端睡眠");
    }
}
