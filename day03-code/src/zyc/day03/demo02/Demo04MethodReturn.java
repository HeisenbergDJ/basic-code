package zyc.day03.demo02;
/*
题目要求：定义一个方法，用来【求出】两个数字之和。(算完过后把结果告诉我)
题目变形：定义一个方法，用来【打印】两个数字之后。(算完过后不用把结果告诉我，自己负责显示)

注意事项：
有返回值方法：可以单独调用、打印调用或者赋值调用
无返回值方法：单独调用，不能使用打印调用或者赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        int number = getSum(10,10);
        System.out.println("结果是：" + number);
        System.out.println("=================");
        printSum(10,20);
        System.out.println("=================");
        System.out.println(getSum(3,4));  //正确写法
        getSum(3,5);//正确写法，但是没有使用返回值
    }
    public static int getSum(int a , int b){
        int result = a + b;
        return result;
    }
    public static void printSum(int a , int b){
        int result = a + b;
        System.out.println("结果是："+ result);
    }
}
