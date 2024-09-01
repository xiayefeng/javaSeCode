package com.atguigui.object.exer01;

/**
 * ClassName: Phone
 * Package: com.atguigui.object.exer01
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 0:24
 * @Version 1.0
 */
public class Phone {

    String name;
    double price;

    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage(String message) {
        System.out.println("send msg:" + message);
    }

    public void playGame() {
        System.out.println("play games");
    }
}
