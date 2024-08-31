package com.atguigu.array.exer1;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu.array.exer1
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 11:15
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (int)(Math.random() * 30) + 1;

           for(int j=0;j<i;j++){
               if(arr[i] == arr[j]){
                   System.out.println(i + "重复:" + arr[j]);
                   i--;
                   break;
               }
           }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
