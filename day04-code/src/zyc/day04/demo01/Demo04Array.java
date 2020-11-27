package zyc.day04.demo01;
/*
题目要求：
遍历数组，对数组当中的每一个元素进行逐一处理，默认处理方式打印输出。
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
        // array.fori 自动生成代码
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
