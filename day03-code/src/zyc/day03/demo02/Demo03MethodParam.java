package zyc.day03.demo02;
/*
有参数：小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候，就是有参数。
例如两个数字相加，必须知道两个数字各自是多少，才能相加。

无参数：小括号当中留空。一个方法不需要任何数据条件，自己就能独自完成任务，就是无参数。
例如定义一个方法，打印固定10次HelloWorld
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            method1(10,10);
        }
        method2();
    }
    public static void method1(int a , int b ){
        int result = a + b;
        System.out.println("结果是：" + result);
    }
    public static void method2(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld!!!" + i);
        }
    }
}
