package com.atguigu11.annotation;


import java.util.Date;

public class AnnotationTest {
    public static void main(String[] args) {
        Person p1= new Student();
        p1.walk();

        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(2022 - 1900, 11, 29);
        System.out.println(date1);

        Person p2= new Person();

        Person p3 = new Person("丽丽");

        System.out.println(p3);

        @SuppressWarnings("unused") int num = 10;
    }
}

class Person {
    String name;
    int age;

    public Person() {
    }

    @Deprecated
    public Person(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }
    public void walk(){
        System.out.println("人走路");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {

    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }

//    @Override
//    public void walk(){
//        System.out.println("学生走路");
//    }
}
