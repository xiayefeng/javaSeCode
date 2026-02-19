package com.atguigu06._final;

public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
//        e.MIN_SCORE = 1;
    }
}

final class A {

}

//class B extends A{} error

//class SubString extends String{} error

class C {
    public final void method(){}
}

class D extends C{
//    public void method(){}
}

class E {
    final int MIN_SCORE = 0;
    final int MAX_SCORE;

    final int LEFT;
    {
        MAX_SCORE = 100;

    }
    public E(){
        LEFT = 63;
    }

    public E(int left) {
        LEFT = left;
    }
}
