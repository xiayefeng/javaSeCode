package com.atguigu.array.exer1;

import java.util.Scanner;

/**
 * ClassName: ArayExer03
 * Package: com.atguigu.array.exer1
 * Description: 回形数
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/8/31 11:33
 * @Version 1.0
 */
public class ArayExer03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个数字:");
        int len = scanner.nextInt();
        int[][] arr =  new int[len][len];

        int s = len * len;

        /*
         * k=1: 向右
         * k=2: 向下
         * k=3: 向左
         * k=4: 向上
         */
        int k =1;
        int i=0,j=0;
        for(int m = 1; m<=s;m++){
            if(k==1){
                if(j<len && arr[i][j]== 0){
                    arr[i][j++] = m;
                }else {
                    k=2;
                    i++;
                    j--;
                    m--;
                }
            }else if(k==2){
                if(i<len && arr[i][j] ==0){
                    arr[i++][j] = m;
                } else {
                    k=3;
                    i--;
                    j--;
                    m--;
                }
            }else if(k==3) {
                if(j>=0 && arr[i][j] == 0){
                    arr[i][j--] = m;
                }else{
                    k=4;
                    i--;
                    j++;
                    m--;
                }
            }else if(k==4){
                if(i>= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                }else{
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
