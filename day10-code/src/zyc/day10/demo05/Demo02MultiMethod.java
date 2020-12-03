package zyc.day10.demo05;
/*
在多态的代码中，成员方法的访问规则是：
    看new的是谁，就先用谁，没有则向上找

口诀：编译看左边，访问看右边。
对比成员变量：
口诀：编译看左边，运行看左边。
 */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();

//        obj.methodZi();//错误写法，Fu类中没有methodZi方法，编译不能通过
    }
}
