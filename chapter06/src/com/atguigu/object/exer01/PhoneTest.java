package com.atguigu.object.exer01;

/**
 * ClassName: PhoneTest
 * Package: com.atguigui.object.exer01
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 0:27
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMessage("asdfsadf");
        phone.name = "oppo phone";
        phone.price = 2000;
        phone.playGame();
    }
}
