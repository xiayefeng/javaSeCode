package com.atguigu.array.exer6;

/**
 * ClassName: ArrayExer01_2
 * Package: com.atguigu.array.exer6
 * Description: 删除一个元素
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 18:57
 * @Version 1.0
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int deleteIndex = 4;

//        for (int i = deleteIndex; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        arr[arr.length - 1] = 0;
        int[] newArr = new int[arr.length - 1];
        for(int i=0;i<deleteIndex;i++){
            newArr[i] = arr[i];
        }

        for(int i= deleteIndex;i<arr.length-1;i++){
            newArr[i] = arr[i+1];
        }

        arr = newArr;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
