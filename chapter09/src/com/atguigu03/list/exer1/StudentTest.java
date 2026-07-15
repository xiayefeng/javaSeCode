package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List list = new ArrayList();
        System.out.println("请录入学生信息:");

        while (true) {
            System.out.println("1:继续录入, 0:结束输入");
            int selection = scan.nextInt();
            if (selection == 0) {
                break;
            }

            System.out.println("请输入学生姓名:");
            String name = scan.next();
            System.out.println("请输入学生的年龄:");
            int age = scan.nextInt();

            Student s = new Student(name, age);
            list.add(s);

        }

        System.out.println("遍历学生信息");
        for(Object obj : list){
            System.out.println(obj);
        }

        scan.close();
    }
}
