package com.atguigu.array.exer2;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu.array.exer2
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 10:06
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};

        int sum = scores[0];
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }

        int avg = (sum - max - min) / (scores.length -2);

        System.out.println("得分为：" + avg);

    }
}
