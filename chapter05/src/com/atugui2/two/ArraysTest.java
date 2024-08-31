package com.atugui2.two;

import java.util.Arrays;

/**
 * ClassName: ArraysTest
 * Package: com.atugui2.two
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 22:33
 * @Version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        System.out.println(arr1== arr2);

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

       int index =  Arrays.binarySearch(arr3, 15);
        System.out.println(index);
    }
}
