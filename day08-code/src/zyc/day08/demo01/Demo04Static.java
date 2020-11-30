package zyc.day08.demo01;
/*
静态代码块的格式：

public class 类名称{
    static {
        //静态代码块的内容
    }
}

静态代码块的特点：

1.  当第一次用到本类时，静态代码块执行唯一的一次。
2.  静态内容总是优先与非静态内容，所以静态代码块比构造方法先执行。

静态代码块的典型用途：
用来一次性地对静态变量进行赋值。
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person tow = new Person();
        Person three = new Person();

    }
}
