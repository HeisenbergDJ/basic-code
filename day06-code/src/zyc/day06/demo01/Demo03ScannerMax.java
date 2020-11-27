package zyc.day06.demo01;

import java.util.Scanner;

/*
题目要求：键盘输入三个int数字，并且找出最大值
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数字是：");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数字是：");
        int num2 = sc.nextInt();
        System.out.println("输入第三个数字是：");
        int num3 = sc.nextInt();
//        int max;
//        if (num1 >= num2){
//            if (num3 >= num1){
//                max = num3;
//            }
//            else{
//                max = num1;
//            }
//        }
//        else{
//            max = num2;
//        }
        int temp = Math.max(num1, num2);
        int max = Math.max(temp, num3);
        System.out.println("最大数为：" + max);
    }
}
