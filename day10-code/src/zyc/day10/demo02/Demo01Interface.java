package zyc.day10.demo02;
/*
接口使用时注意事项：
1. 接口没有静态代码块或构造方法
2. 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
格式：
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceA{
    //重写所有抽象方法
}
3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要重写一次即可
4. 如果实现类没有重写所有接口的所有抽象方法，那么该实现类必须是一个抽象类。
5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现实现类一定要对冲突的默认方法进行重写。
6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生冲突，优先用父类的方法
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodAbs();
        Zi zi = new Zi();
        zi.method();
    }
}
