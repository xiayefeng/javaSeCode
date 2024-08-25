package com.atguigu.array;

/**
 * ClassName: TwoArrayTest
 * Package: com.atguigu.array
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/25 20:03
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        String[][] arr3 = new String[3][4];

        double[][] arr4 = new double[2][];

        int arr5[][] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        int arr7[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        String arr8[][] = new String[3][4];

        System.out.println(arr2[0][0]);

        System.out.println(arr2[0]);

        arr3[0][1] = "Tom";

        arr4[0] = new double[4];
        arr4[0][0] = 1.0;

        System.out.println(arr2.length);

    }
}
















