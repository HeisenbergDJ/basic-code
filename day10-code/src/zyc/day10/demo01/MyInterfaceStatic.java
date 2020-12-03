package zyc.day10.demo01;
/*
从java 8开始，接口当中允许定义静态方法

静态方法&默认方法
静态方法一直不变，不管是什么对象都一样。
默认方法更为灵活，可以有部分对象选择默认，也可以有部分对象自定义：重写默认方法

静态方法定义：
public static 返回值类型 方法名称(参数列表){
    //...
}
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
    }
}
