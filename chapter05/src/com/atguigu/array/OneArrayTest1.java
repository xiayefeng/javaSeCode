package com.atguigu.array;

/**
 * ClassName: OneArrayTest1
 * Package: com.atguigu.array
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/25 16:45
 * @Version 1.0
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        int arr[] = new int[4];
        System.out.println(arr[0]);

        double arr1[] = new double[5];
        System.out.println(arr1[0]);

        char[] arr4 = new char[4];
        System.out.println(arr4[0]);

        if (arr4[0] == 0) {
            System.out.println("11111");
        }
        System.out.println(arr4[0] + 1);
        if(arr4[0] == '0') {
            System.out.println("22222");
        }
        if(arr4[0] == '\u0000') {
            System.out.println("33333");
        }

        boolean arr5[] = new boolean[4];
        System.out.println(arr5[0]);

        String[] arr6 = new String[5];
        System.out.println(arr6[0]);
    }
}
