package com.atguigu.array.exer6;

/**
 * ClassName: ArrayExer02_2
 * Package: com.atguigu.array.exer6
 * Description: 二分法查找 时间复杂度 O(log2 N)  数组必须有序
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 19:14
 * @Version 1.0
 */
public class ArrayExer02_2 {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2, 4, 5, 8, 12, 15, 19, 26, 37, 49, 51, 66, 89, 100};
        int target = 17;
        int head = 0;
        int end = arr2.length - 1;
        int index = -1;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (target == arr2[middle]) {
                index = middle;
                break;
            } else if (target > arr2[middle]) {
                head = middle + 1;
            } else if (target < arr2[middle]) {
                end = middle - 1;
            }
        }
        if (index == -1) {
            System.out.println("未找到元素");
        } else {
            System.out.println("target 元素" + target + "index:" + index);
        }
    }
}
