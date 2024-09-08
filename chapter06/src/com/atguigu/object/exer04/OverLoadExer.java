package com.atguigu.object.exer04;

/**
 * ClassName: OverLoadExer
 * Package: com.atguigui.object.exer04
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 19:41
 * @Version 1.0
 */
public class OverLoadExer {
    public  void moL(int num){
        System.out.println(num * num);
    }
    public void moL(int num1, int num2){
        System.out.println(num1*num2);
    }
    public void moL(String message){
        System.out.println(message);
    }

    public int max(int i, int j){
        return i>=j ? i : j;
    }
    public double max(double i, double j){
        return i>=j ? i : j;
    }
    public double max(double i, double j, double k) {
        return max(max(i, j), k);
    }
}
