package zyc.day10.demo01;
/*
注意事项：不能通过是实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称直接调用其中的静态方法
 */
public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStatic impl = new MyInterfaceStaticImpl();

        //错误写法
//        impl.methodStatic();

        //直接通过接口名称调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
