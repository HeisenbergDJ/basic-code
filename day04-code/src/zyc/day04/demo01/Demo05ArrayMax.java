package zyc.day04.demo01;
/*
题目要求：
找出数组中最大的元素
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 1, 2};
        int max= array[0] ;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
        }
        System.out.println(max);
    }
}
