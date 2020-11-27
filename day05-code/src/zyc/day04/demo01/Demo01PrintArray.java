package zyc.day04.demo01;

import java.util.Arrays;

/*
面向过程：实现一个功能，每一个具体的步骤都要亲历亲为，详细处理每一个细节
面向对象：实现一个功能，找一个具有该功能的人，来帮我完成。
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};
        // 要求打印格式为：[10, 20, 30, 40, 50]

        // 使用面向过程：
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1]);
        System.out.println("]");
        System.out.println("=============");

        // 使用面向对象
        System.out.println(Arrays.toString(array));
    }
}