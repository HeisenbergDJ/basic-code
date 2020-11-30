package zyc.day08.demo01;

public class MyClass {

    int num ;//成员变量
    static int numStatic;//静态变量
    //成员方法
    public void method(){
//        System.out.println(this.numStatic);
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println("这是一个成员方法！");
    }
    //静态方法
    public static void methodStatic(){
        System.out.println(numStatic);
//        System.out.println(num);//静态方法不能访问成员变量；
//        method;//静态方法不能访问成员方法
//        methodStatic();//可以执行，但会死循环
        System.out.println("这是一个静态方法！");
//        System.out.println(this);//java自动翻译成MyClass.和this.矛盾
    }
}
