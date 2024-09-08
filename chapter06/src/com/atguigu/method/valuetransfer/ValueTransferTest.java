package com.atguigu.method.valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Package: com.atguigu.mehhod.valuetransfer
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 10:00
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        int m = 10;
        int n = m;
        System.out.println("m="+ m + ",n="+ n);
        m++;
        System.out.println("m="+ m + ",n="+ n);

        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;
        arr2[0] = 10;

        System.out.println(arr1[0]);

        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1;

        order2.orderId = 1002;

        System.out.println(order1.orderId);

    }
}

class Order{
    int orderId;
}