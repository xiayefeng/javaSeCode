package com.atguigu.array.exer6;

/**
 * ClassName: ArrayExer02_1
 * Package: com.atguigu.array.exer6
 * Description: 顺序查找 时间复杂度 O(n)
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 19:07
 * @Version 1.0
 */
public class ArrayExer02_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int target = 5;
        int index = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("找到了" + target + ":" + index);
        } else {
            System.out.println("未找到此元素");
        }

    }
}
