package com.atguigu.array.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu.array.exer5
 * Description: 反转 int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 15:57
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        /*for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1-i];
            arr[arr.length -1-i] = temp;
        }*/
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
