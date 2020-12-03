package zyc.day10.demo01;
/*
接口就是多个类的公共规范
接口是一种引用类型，最重要的内容就是其中的，抽象方法
接口定义：
public interface 接口名称{
    //接口内容
}
备注：换成关键字interface之后，编译生成的字节码文件仍然是 .java---->.class

Java 7 接口中包含内容：
1. 常量
2. 抽象方法
Java 8 接口中包含内容：
3. 默认方法
4. 静态方法
Java 9 接口中包含内容：
5. 私有方法

接口使用的步骤
1. 接口不能直接使用，必须有一个“实现类”来“实现”接口
格式：
public class 实现类名称 implement 接口名称{
    //...
}
2. 接口中的实现类，必须重写接口中的所有抽象方法。
3. 创建实现类的对象，进行使用

注意事项：
如果实现类并没有重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类。
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();
        //创建实现类的对象使用
        MyInterfaceAbstract impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
