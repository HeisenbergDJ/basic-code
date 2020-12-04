package zyc.day11.demo05;
/*
如果一个类是定义在一个方法内部的，那么这就是一个局部内部类。
局部内部类只有当前所属的方法才能使用它，出了这个方法外面就不能用了。

定义格式：
修饰符 class 外部类名称{
    修饰符 返回值类型 方法名称(){
        修饰符 class 局部类名称{
            //...
        }
        //...
    }
    //...
}

小结：
类的权限修饰符：
public > protected > (default) > private
1. 外部类：public / (default)
2. 成员内部类：public / protected / (default) / private
3. 局部内部类：什么都不能写

 */
public class Outer {
    public void methodOuter(){
        class Inner {
            int num = 10;
            public void methodInner(){
                System.out.println("AAA");
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }

}
