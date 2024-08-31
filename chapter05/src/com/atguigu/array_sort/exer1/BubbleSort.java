package com.atguigu.array_sort.exer1;

/**
 * ClassName: BubbleSort
 * Package: com.atguigu.array_sort.exer1
 * Description: 冒泡排序
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 20:46
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // 冒泡排序
        for (int j = 0; j < arr.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < arr.length-1-j; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
