package zyc.day08.demo04;
/*
java.lang.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。
public static double abs(double num)            获取绝对值。
public static double ceil(double num)           向上取整
public static double floor(double num)          向下取整
public static long round(double num)            四舍五入

Math.PI 代表圆周率常量(double);
 */
public class Demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(10.0));
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(-10.9));//【上】表示数轴正方向；【下】表示数轴负方向
        System.out.println(Math.round(3.4));
        System.out.println(Math.PI);
    }
}
