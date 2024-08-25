package com.atguigu.array;

/**
 * ClassName: OneArrayTest
 * Package: com.atguigu.array
 * Description: 一维数组的测试
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/25 16:18
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[]{20.32, 43.32, 43.22};

//       String[] foods;
//       foods = new String[] {"拌海蜇", "龙须菜", "炝冬笋"};
        String[] foods = new String[4];

        int[] arr = {1, 2, 3, 4};

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
//        System.out.println(prices[3]);
        foods[0] = "拌海蜇";
        foods[1] = "龙须菜";
        foods[2] = "炝冬笋";
        foods[3] = "玉兰片";
//        foods[4] = "酱茄子";
        System.out.println(foods.length);
        System.out.println(prices.length);

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }

    }
}
