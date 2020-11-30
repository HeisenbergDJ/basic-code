package zyc.day08.demo04;

import java.util.Arrays;

/*
题目：
请使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "hello1f2e4bv5th3s5eFWD";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1  ; i > 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("===========");
        for (int i = chars.length-1  ; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
