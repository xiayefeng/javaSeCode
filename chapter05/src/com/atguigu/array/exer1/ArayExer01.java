package com.atguigu.array.exer1;

/**
 * ClassName: ArayExer01
 * Package: com.atguigu.array.exer1
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 9:54
 * @Version 1.0
 */
public class ArayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        int avgValue = sum / arr.length;

        System.out.println("最大值：" + max);
        System.out.println("最小值：" + min);
        System.out.println("总和：" + sum);
        System.out.println("平均值：" + avgValue);
    }
}



























