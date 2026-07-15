package com.atguigu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    @Test
    public void test() {
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add(123);
        coll.add("尚硅谷");
        coll.add(new Object());
        coll.add(new Person("Tom", 22));
        System.out.println(coll);

        System.out.println(coll.size());

        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(456);
        coll.addAll(coll1);

        System.out.println(coll1);
        System.out.println(coll);

        System.out.println(coll.size());

    }

    @Test
    public void test2() {
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add(128);
        coll.add("尚硅谷");
        Person p1 = new Person("Tom", 22);
        coll.add(p1);
        System.out.println(coll.isEmpty());
        System.out.println(coll);
        System.out.println(coll.contains("AA"));
        System.out.println(coll.contains(128));
        System.out.println(coll.contains(p1));


        Collection coll1 = new ArrayList();

        coll1.add("AA");
        coll1.add("尚硅谷");
        System.out.println(coll.containsAll(coll1));
    }

    @Test
    public void test3() {
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add(128);
        coll.add("尚硅谷");
        Person p1 = new Person("Tom", 22);
        coll.add(p1);

//        coll.clear();
        System.out.println(coll);
        System.out.println(coll.size());

        coll.remove(p1);
        System.out.println(coll);
    }
}
