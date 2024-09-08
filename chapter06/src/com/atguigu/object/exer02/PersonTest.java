package com.atguigu.object.exer02;

/**
 * ClassName: PersonTest
 * Package: com.atguigui.object.exer02
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 0:42
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';

        System.out.println("姓名：" + p1.name + ",年龄:" + p1.age + ",性别：" + p1.gender);

        p1.eat();
        p1.sleep(6);
        p1.interests("吃喝玩乐!");

        Person p2= new Person();
        p2.name ="露丝";
        p2.age = 18;
        p2.gender = '女';
        System.out.println("姓名：" + p2.name + ",年龄:" + p2.age + ",性别：" + p2.gender);
    }
}
