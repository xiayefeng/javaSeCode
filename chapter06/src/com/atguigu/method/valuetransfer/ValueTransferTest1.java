package com.atguigu.method.valuetransfer;

/**
 * ClassName: ValueTransferTest1
 * Package: com.atguigu.method.valuetransfer
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 10:16
 * @Version 1.0
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 test = new ValueTransferTest1();

        int m =10;

        test.method1(m);

        System.out.println("m=" + m);

        Person p = new Person();
        p.age = 10;

        test.method2(p);

        System.out.println(p.age);

    }
    public void method1(int m){
        m++;
    }

    public void method2(Person p){
        p.age++;
    }
}

class Person{
    int age;
}
