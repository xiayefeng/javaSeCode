package com.atguigu.object.exer03;

/**
 * ClassName: StudentTest
 * Package: com.atguigui.object.exer03
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 18:17
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        StudentUtil util = new StudentUtil();

//        for (int i = 0; i < students.length; i++) {
//            if (3 == students[i].state) {
//                Student stu = students[i];
////                System.out.println("number:" + stu.number + ", state:" + stu.state + ",score:" + stu.score);
//                stu.show();
//            }
//        }
        util.printStudentsWidthIndex(students, 3);

        System.out.println("排序前");
//        for (int i = 0; i < students.length; i++) {
//            students[i].show();
//        }
        util.printStudet(students);
        util.sortStudent(students);
        System.out.println("**********************");
        System.out.println("排序后");
//        for (int i = 0; i < students.length; i++) {
//            students[i].show();
//        }
        util.printStudet(students);
    }
}
