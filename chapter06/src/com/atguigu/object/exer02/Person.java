package com.atguigu.object.exer02;

/**
 * ClassName: Person
 * Package: com.atguigui.object.exer02
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 0:37
 * @Version 1.0
 */
public class Person {
  String name; // 姓名
    int age; // 年龄
    char gender; // 性别

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int hour){
        System.out.println("睡觉"+ hour + "小时");
    }

    public void interests(String hobits){
        System.out.println(hobits);
    }
}
