package com.atguigu02.singlenton;

public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }

}
// 饿汉模式
class Bank{
    private Bank(){

    }

    private static Bank instance = new Bank();

    public static Bank getInstance(){
        return instance;
    }
}
