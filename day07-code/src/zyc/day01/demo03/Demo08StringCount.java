package zyc.day01.demo03;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Demo08StringCount {
    public static void main(String[] args) {
        String str1 = "sdfsfsdasdded";
        Method01(str1); //这个方法是计算各个字符出现的次数，而不是种类



        System.out.println("================="); //这个方法是统计各种字符出现的次数
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int countUpper = 0 ;
        int countLower = 0 ;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && 'Z' >= ch) {
                countUpper++;
            }
            else if ('a' <= ch && 'z' >= ch){
                countLower++;
            }
            else if ('0' <= ch && '9' >= ch){
                countNumber++;
            }
            else {
                countOther++;
            }
        }
        System.out.println("The amount of Upper is " + countUpper);
        System.out.println("The amount of Lower is " + countLower);
        System.out.println("The amount of Number is " + countNumber);
        System.out.println("The amount of Other is " + countOther);
        System.out.println("================="); //这个方法是网上的好办法
        Scanner sc2 = new Scanner(System.in);
        String input2 = sc2.next();
        String result = removeRepeatChar(input2);
        System.out.println(result);

    }

    public static String removeRepeatChar(String s) {
        if (s == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {//这个是如果这两个值相等，就让i+1取下一个元素
                i++;
            }
        }
        return sb.toString();
    }








    //第一种方法所调用的方法
    public static void Method01(String str){
        char[] ch1 = str.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            int num = 0;
            int num1 = str.indexOf(ch1[i]);
            for (int j = num1; j < ch1.length; j++) {
                if(ch1[num1] == ch1[j]){
                    num++;
                }
            }
            System.out.println("The amount of " + ch1[num1] + " is " + num);
        }
        return;
        }
    }