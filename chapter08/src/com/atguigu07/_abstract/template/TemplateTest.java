package com.atguigu07._abstract.template;

public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p = new PrintPrimeNumber();
        p.spendTime();
    }
}

abstract class Template {
    public void spendTime() {
     long star = System.currentTimeMillis();
     code();
     long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - star));
    }
    public abstract void code();
}

class PrintPrimeNumber extends Template {
    @Override
    public void code() {
        for(int i=2; i<= 100000; i++){
            boolean isFlag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j ==0) {
                    isFlag = false;
                    break;
                }
            }
            if(isFlag) {
                System.out.println(i);
            }
        }
    }
}