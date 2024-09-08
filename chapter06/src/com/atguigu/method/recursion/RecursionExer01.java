package com.atguigu.method.recursion;

/**
 * ClassName: RecursionExer01
 * Package: com.atguigu.method.recursion
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/8 13:23
 * @Version 1.0
 */
public class RecursionExer01 {
    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
        }
    }


    /**
     *
     * @param n
     * @return
     */
    public int func(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }
}
