package zyc.day10.demo01;
/*
在任何版本的接口中，都可以定义抽象方法
抽象方法定义：
public abstract 返回值类型 方法名称(参数列表);

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以省略不写
3. 方法的三要素，可以随意定义
 */
public interface MyInterfaceAbstract {
    //这是一个抽象方法
    public abstract void methodAbs1();
    public abstract void methodAbs2();
    public abstract void methodAbs3();
    public abstract void methodAbs4();

}
