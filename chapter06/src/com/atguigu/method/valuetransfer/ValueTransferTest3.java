package com.atguigu.method.valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Package: com.atguigu.method.valuetransfer
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 10:36
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();
        Data data = new Data();
        data.m =10;
        data.n = 20;
        System.out.println("m="+ data.m + ",n=" + data.n);

//        int temp = data.m;
//        data.m = data.n;
//        data.n = temp;
        test.swap(data);
        System.out.println("m="+ data.m + ",n=" + data.n);


    }
    public void swap(Data data){
        int temp = data.m;
        data.m=data.n;
        data.n=temp;
    }
}

class Data{
    int m;
    int n;
}
