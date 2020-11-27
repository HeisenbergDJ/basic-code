package zyc.day04.demo01;

import java.util.MissingFormatArgumentException;

/*
数组元素的反转：
本来的样子：{1, 2, 3, 4}
之后的样子：{4, 3, 2, 1}
 */
public class Demo06ArrayReverse {
    public static void main(String[] args) {
        //有点笨(还占用内存)的方法：
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);
        System.out.println();
        int[] yarra = new int[array.length];
        int len = array.length;
        for (int i = 0; i < len; i++) {
            yarra[len - 1 - i] = array[i];
        }
        printArray(yarra);
        //新的方法(不使用新的数组!!)
        System.out.println();
        int box;
        for (int i = 0; i < array.length; i++) {
            box = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = box;
            if (i > array.length - i) {
                break;
            }
        }
        printArray(array);
        //新的方法
        System.out.println();
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
            if (min > max) {
                break;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
