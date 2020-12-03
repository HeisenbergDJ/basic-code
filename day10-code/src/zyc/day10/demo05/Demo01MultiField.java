package zyc.day10.demo05;
/*
访问成员变量的两种方式：
1. 直接访问：通过对象名称访问 对象名.变量名称
规则：看等号左边是谁，优先用谁，没有则向上找
2. 间接访问：通过成员方法访问 get_num()
规则：看该方法属于谁，优先用谁，没有则向上找
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);
        Zi zi = new Zi();
        System.out.println(zi.num);
        //System.out.println(obj.age);//错误写法，父类没有age变量，只会向上找！
        System.out.println("==========");

        obj.showNum();//子类没有重写showNum方法，只有父类，所以用父类的num


    }
}
