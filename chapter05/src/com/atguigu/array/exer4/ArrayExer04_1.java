package com.atguigu.array.exer4;

/**
 * ClassName: ArrayExer04_1
 * Package: com.atguigu.array.exer4
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 15:32
 * @Version 1.0
 */
public class ArrayExer04_1 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        System.out.println();
        System.out.println(array1);
        System.out.println(array2);

        for (int i = 0; i < array2.length; i++) {
            if(i%2==0){
                array2[i] = i;
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
    }
}
