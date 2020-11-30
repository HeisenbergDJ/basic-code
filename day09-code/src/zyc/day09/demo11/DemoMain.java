package zyc.day09.demo11;
/*
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：抽象方法所在的类，必须是抽象类。在class之前写上abstract即可。

如何使用抽象类和抽象方法
1.  不能直接创建new抽象类对象
2.  必须用一个子类来继承抽象父类
3.  子类必须重写父类当中所有的抽象方法。
重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
4.  创建子类对象，进行使用
 */
public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal();//不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }

}
