package com.atguigu.object.exer03;

/**
 * ClassName: Studentutil
 * Package: com.atguigui.object.exer03
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 18:41
 * @Version 1.0
 */
public class StudentUtil {
    /**
     * 打印指定年纪的信息
     * @param students 要打印的数组
     * @param state 要打印的的班级
     */
    public void printStudentsWidthIndex(Student[] students, int state){
        for (int i = 0; i < students.length; i++) {
            if (state == students[i].state) {
                Student stu = students[i];
//                System.out.println("number:" + stu.number + ", state:" + stu.state + ",score:" + stu.score);
                stu.show();
            }
        }
    }

    public void printStudet(Student [] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }

    public void sortStudent(Student[] students){
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
