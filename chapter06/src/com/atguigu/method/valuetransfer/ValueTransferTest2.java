package com.atguigu.method.valuetransfer;

/**
 * ClassName: ValueTransferTest2
 * Package: com.atguigu.method.valuetransfer
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 10:29
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();

        int m =10;
        int n=20;

        System.out.println("m="+ m + ",n=" + n);

//        int temp = m;
//        m=n;
//        n=temp;
        test.swap(m,n);
        System.out.println("m="+ m + ",n=" + n);

    }

    public void swap(int m, int n){
        int temp = m;
        m=n;
        n=temp;
    }
}
