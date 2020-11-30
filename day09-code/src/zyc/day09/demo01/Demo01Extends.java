package zyc.day09.demo01;
/*
定义父类格式：（一个普通类的定义）

public class 父类名称{
    //...
}


定义子类格式：

public class 子类名称 extends 父类名称{
    //...
}
 */
public class Demo01Extends {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
