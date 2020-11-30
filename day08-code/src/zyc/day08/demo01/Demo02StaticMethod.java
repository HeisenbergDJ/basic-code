package zyc.day08.demo01;
/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，属于类的。

如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它。

总结：
无论是成员变量，还是成员方法，如果有了static，都推荐使用类名称进行调用。
成员变量：类名称.静态变量
成员方法：类名称.静态方法
对于本类方法，可以省略类名称

注意事项：
1.  静态内容不能访问非静内容
原因：内存当中【先】有静态内容，【后】有非静态内容
2.  静态方法中不能使用this.
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。而静态在类中，没有对象。
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        MyClass.methodStatic();

//        obj.methodStatic(); //该写法也可以执行，在编译过后被java翻译为MyClass.methodStatic()
        MyMethod();//在编译过后被java翻译为Demo02StaticMethod.MyMethod

    }

    public static void MyMethod(){
        System.out.println("本类方法执行");
    }
}
