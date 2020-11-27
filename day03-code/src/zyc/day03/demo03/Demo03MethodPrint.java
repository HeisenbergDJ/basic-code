package zyc.day03.demo03;
/*
题目要求：
定义一个方法，用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printN(11);
    }
    public static void printN(int a ){
        for (int i = 1; i < a; i++) {
            System.out.println("HelloWorld!!" + i);
        }
    }
}
