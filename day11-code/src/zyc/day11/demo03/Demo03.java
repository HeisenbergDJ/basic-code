package zyc.day11.demo03;

import java.util.Objects;

public class Demo03 {
    public static void main(String[] args) {
        String s1 = null ;
        String s2 = "abc";
        System.out.println(s1.equals(s2));//报错：NullPointerException
        System.out.println(Objects.equals(s1, s2));//Objects 中的eq
    }
}
