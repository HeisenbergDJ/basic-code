package zyc.day08.demo04;

import java.util.Arrays;

/*
java.util.Arrays 是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组的常见操作。
常见的静态方法：
public static String toString(数组)           将数组变成字符串（按照指定格式：[元素1,元素2,元素3,...]
public static void sort(数组)                 将数组的元素升序排序
备注：
1.  如果是数值，sort默认按照升序从小到大
2.  如果是字符串，sort默认按照字母升序
3.  如果是自定义的类型， 那么这个自定义的类需要有comparable或comparator接口的支持。（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        String intStr = Arrays.toString(array);
        System.out.println(intStr);
        System.out.println("================");

        int[] array1 = {1, 2, 10, 9, 8, 4};
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        System.out.println("=============");
        String[] array2 = {"bbb","aaa","ccc"};
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
