package com.atguigu.list;

import com.atguigu.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    @Test
    public void test() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(new Person("Tom", 33));
        System.out.println(list);
        list.add(2, "CC");
        System.out.println(list);

        List list1 = Arrays.asList(1, 2, 3);

        list.addAll(1, list1);
        System.out.println(list);
    }

    @Test
    public void test2() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2);
        list.add(new Person("Tom", 33));
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }

    @Test
    public void test3() {
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2);
        list.add(new Person("Tom", 33));

        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (Object obj : list) {
//            System.out.println(obj);
//        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
