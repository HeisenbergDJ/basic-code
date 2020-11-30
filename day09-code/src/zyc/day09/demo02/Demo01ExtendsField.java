package zyc.day09.demo02;
/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问方式：
 1. 【直接】通过子类对象访问成员变量
        等号左边是谁，就优先用谁，没有则向上找
 2. 【间接】通过成员方法访问成员变量
        该方法属于谁，就优先用谁，没有则向上找。
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        Zi zi = new Zi();
        Fu fuzi = new Zi(); // 多态（以后再学）
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("============");
        System.out.println(zi.num);   //优先子类 200
        System.out.println(fuzi.num); //优先父类 100
        System.out.println("============");

        zi.methodZi();//这个方法是子类的，优先用子类的。如果没有再向上找
        zi.methodFu();//这个方法是父类当中定义的，

    }
}
