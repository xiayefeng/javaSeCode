package com.atguigu.method.valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu.method.valuetransfer.exer1
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 10:56
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle, 5);

        System.out.println("now radius is: " + circle.radius);
    }

    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        int i=1;
        for(;i<=time;i++){
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }

        c.radius = i;
    }
}
