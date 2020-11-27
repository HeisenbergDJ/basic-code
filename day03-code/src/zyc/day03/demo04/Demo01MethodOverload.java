package zyc.day03.demo04;
/*
方法重载(Overload)：
多个方法的名称不一样，但是参数列表不一样。
参数列表不一样：1. 参数个数不同。 2. 参数类型不同。 3. 参数的多类型顺序不同
方法重载与下列因素无关：1. 与参数的名称无关。 2. 与参数的返回值类型无关。
好处：
只需记住唯一一个方法的名称，就可以实现类似多个的功能。
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,1));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.2,1.5));
        System.out.println(sum(1,1.5));
    }
    public static int sum(int a , int b){
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }
    public static double sum(double a ,double b){
        System.out.println("double类型的方法执行！");
        return a + b;
    }
    public static int sum(int a ,double b){
        System.out.println("多类型参数的方法执行！");
        return (int) (a + b);
    }
    public static int sum(int a , int b , int c){
        System.out.println("有3个参数的方法执行！");
        return a + b + c;
    }
    public static int sum(int a , int b , int c , int d){
        System.out.println("有4个参数的方法执行！");
        return a + b + c + d;
    }
}
