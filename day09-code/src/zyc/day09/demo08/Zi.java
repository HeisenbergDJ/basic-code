package zyc.day09.demo08;
/*
super关键字的用法有三种：
1.  在子类的成员方法中，访问父类的成员变量。
2.  在子类的成员方法中，访问父类的成员方法。
3.  在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
        super();
    }

    public void methodZi(){
        System.out.println(super.num);
    }

    public void method(){
        super.method();
        System.out.println("ddd");
    }
}
