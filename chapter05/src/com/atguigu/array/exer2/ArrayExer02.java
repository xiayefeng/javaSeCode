package com.atguigu.array.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu.array.exer2
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/25 17:30
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Staturday", "Sunday"};
        Scanner scan = new Scanner(System.in);

        int day;
        do {
            System.out.print("请输入输入数值(1-7):");
            day = scan.nextInt();
            if (day < 1 || day > 7) {
                System.out.println("输入有误");
            } else {
                System.out.println(weeks[day - 1]);
            }
        } while (day < 1 || day > 7);

        scan.close();
    }
}
