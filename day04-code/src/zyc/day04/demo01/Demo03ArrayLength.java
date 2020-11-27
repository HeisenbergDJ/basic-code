package zyc.day04.demo01;
/*
获取数组长度格式：
数组名称.length
这将返回一个int数字，代表数组的长度
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = {10, 20, 30, 40, 50, 60, 70, 80};
        int len = arrayA.length;
        System.out.println("数值的长度为：" + len);

        int[] arrayB = new int[3];
        System.out.println(arrayB.length);
        arrayB = new int[5];                //两个int创建了两个数组在堆中的空间，arrayB只是储存的内存地址改变。
        System.out.println(arrayB.length);
    }
}
