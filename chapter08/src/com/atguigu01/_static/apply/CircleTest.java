package com.atguigu01._static.apply;

public class CircleTest {
    public static void main(String[] args) {
       Circle c1 = new Circle();
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle(2.3);
        System.out.println(c3);

        System.out.println(Circle.total);
    }
}

class Circle {

    double radius; //实例半径

    int id; //编号

    static int total;

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }
    private static int init =1001;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
