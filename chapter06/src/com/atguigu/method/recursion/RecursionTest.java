package com.atguigu.method.recursion;

/**
 * ClassName: RecursionTest
 * Package: com.atguigu.method.recursion
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 12:52
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        test.method1();
        QuickSort qSort = new QuickSort();

        System.out.println(test.getSum(100));

        System.out.println(test.getSum1(100));
        System.out.println(test.getMul(10));

        System.out.println(test.f(10));

        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        qSort.quickSort(data);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));

    }

    public void method1() {
        System.out.println("method1()...");
//        method1();
    }

    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        }
        return num + getSum(num - 1);
    }

    /**
     * 计算n的阶乘 n!
     *
     * @param n int
     * @return
     */
    public int getMul(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getMul(n - 1);
    }



    /**
     * 汉若塔游戏
     */

    /**
     * 斐波那契数列
     * 1 1 2 3 5 8 13 21 34 ..
     * f(n) = f(n-1) + f(n-2)
     */
    public int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }

    /**
     * File类的对象表示一个文件目录
     */
}

/**
 * 快速排序
 */
 class QuickSort {
    private void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    private void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0)
                    ;
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            swap(data, start, high);

            subSort(data, start, high - 1);//递归调用
            subSort(data, high + 1, end);
        }
    }
    public void quickSort(int[] data){
        subSort(data,0,data.length-1);
    }

}
