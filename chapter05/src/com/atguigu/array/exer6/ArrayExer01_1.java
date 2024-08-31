package com.atguigu.array.exer6;

/**
 * ClassName: ArrayExer01_1
 * Package: com.atguigu.array.exer6
 * Description: 新增元素
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 16:12
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int[] newArr = new int[arr.length << 1];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length+2] = 30;

        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        newArr = null;
        System.out.println();
    }
}
