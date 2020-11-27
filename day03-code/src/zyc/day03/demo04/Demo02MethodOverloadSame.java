package zyc.day03.demo04;
/*
题目要求：
定义一个方法，比较两个数据是否相等。
参数类型分别为两个byte类型，两个short类型，两个int类型，两个long类型，并在main方法中进行测试。
 */
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame(1,8));
        System.out.println(isSame((short) 2 , (short) 4));
        System.out.println(isSame(12L,3L));
        byte a = 10;
        byte b = 10;
        System.out.println(isSame(a,b));
    }
    public static boolean isSame(byte a ,byte b){
        System.out.println("两个byte参数的方法执行！");
        return a == b;
    }
    public static boolean isSame(short a, short b){
        System.out.println("两个short参数的方法执行！");
        return a == b;
    }
    public static boolean isSame(int a , int b){
        System.out.println("两个int参数的方法执行！");
        return a == b;
    }
    public static boolean isSame(long a , long b){
        System.out.println("两个long参数的方法执行！");
        return a == b;
    }
}
