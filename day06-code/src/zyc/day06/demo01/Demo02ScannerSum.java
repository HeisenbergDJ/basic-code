package zyc.day06.demo01;

import java.util.Scanner;

/*
题目要求：键盘输入两个int数字，并且求出和值
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个int数字：");
        int num1 = sc.nextInt();
        System.out.println("输入第二个int数字：");
        int num2 = sc.nextInt();
        System.out.println("两个数字求和的结果是：");
        System.out.println(num1 + num2);
    }
}
