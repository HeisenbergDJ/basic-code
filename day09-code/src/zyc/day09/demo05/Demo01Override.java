package zyc.day09.demo05;
/*
方法的重写注意事项：
1.  方法名称一样，参数列表一样
@Override 写在方法前面，用来检测是不是有效的正确重写。这是注解(Annotation not comment)
这个Annotation是安全检测手段，可以不写。

2.  子类方法的返回值必须【小于等于】父类的返回值类型。
java.lang.Objecdt类是所有类的公共最高父类，java.lang.String就是Object的子类

3.  子类方法的权限必须【大于等于】父类方法的权限。
public > protected > (default) > private
备注：(default)不是关键字default，而是什么都不写，留空
 */
public class Demo01Override {
    public static void main(String[] args) {

    }
}
