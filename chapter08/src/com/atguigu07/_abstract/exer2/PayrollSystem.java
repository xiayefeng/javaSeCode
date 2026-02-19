package com.atguigu07._abstract.exer2;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("李小东", 1001,
                new MyDate(1990, 12, 11), 3000);
        emps[1] = new HorlyEmployee("张小东", 1002, new MyDate(1992, 10, 11), 100, 300);
        System.out.println("请输入当前的月份:");
        int month = scan.nextInt();
        for(int i=0;i<emps.length;i++){
            System.out.println(emps[i]);
            System.out.println(emps[i].earnings());
            if(month == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐，加薪100");
            }
        }
        scan.close();
    }
}
