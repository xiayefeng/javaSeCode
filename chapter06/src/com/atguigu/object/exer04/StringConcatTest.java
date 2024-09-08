package com.atguigu.object.exer04;

/**
 * ClassName: StringConcatTest
 * Package: com.atguigui.object.exer04
 * Description:
 *
 * @Author xiayu_12@yeah.net
 * @Create 2024/9/1 20:34
 * @Version 1.0
 */
public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        String info = test.concat("-", "hello", "world");
        System.out.println(info);
        System.out.println(test.concat("/", "hello", "world"));
        System.out.println(test.concat("/", "hello"));
    }

    public String concat(String operator, String ... strs){
       String result = "";
        for (int i = 0; i < strs.length; i++) {
            if(i==0){
                result += strs[i];
            }else {
                result += (operator + strs[i]);
            }
        }

       return result;
    }
}
