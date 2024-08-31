package com.atguigu.array.exer3;

/**
 * ClassName: YangHuiTest
 * Package: com.atguigu.array.exer3
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 10:32
 * @Version 1.0
 */
public class YangHuiTest {
    public static void main(String[] args) {
        //1、创建二维数组
        int[][] yarnHui = new int[10][];

        for (int i = 0; i < yarnHui.length; i++) {
            yarnHui[i] = new int[i + 1];
            yarnHui[i][0] = 1;
            yarnHui[i][i] = 1;
            for (int j = 1; j < yarnHui[i].length - 1; j++) {
                yarnHui[i][j] = yarnHui[i-1][j] + yarnHui[i-1][j-1];
            }
        }

        for (int i = 0; i < yarnHui.length; i++) {
            for (int j = 0; j < yarnHui[i].length; j++) {
                System.out.print(yarnHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
