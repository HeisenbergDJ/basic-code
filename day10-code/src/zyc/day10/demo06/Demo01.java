package zyc.day10.demo06;
/*
向上转型一定是安全的，但是有一个弊端：
一旦向上转型为父类，那么就无法调用子类原本特有的方法。

解决方法：
用对象的向下转型【还原】
 */
public class Demo01 {
    public static void main(String[] args) {
        //对象的向上转型就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
//        cat.catchMouse;  //错误写法，因为这里把猫当作了动物对待

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //下面是错误的向下转型，本来new的时候是一直猫，把他当作狗了。
//        Dog dog = (Dog) animal;  //错误写法，没有红线，编译不会报错，但是运行会出现异常：ClassCastException
    }

}
