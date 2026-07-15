package com.atguigu03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char) (Math.random() * (122 - 97 + 1) + 97) + "");
        }
        System.out.println(list);
        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int dCount = listTest(list, "d");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("d:" + dCount);
    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object obj : list) {
            if (s.equals(obj)) {
                count++;
            }
        }
        return count;
    }
    
}
