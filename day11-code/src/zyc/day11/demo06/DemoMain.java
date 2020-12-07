package zyc.day11.demo06;
/*
如果接口的实现类，或者父类的子类，只需要使用唯一的一次
那么可以省略掉该类的定义，改为使用【匿名内部类】

匿名内部类的格式：
接口名称 对象 = new 接口名称(){
    //重写接口方法
}

注意事项：
1. new代表创建对象的操作
2. 接口名称，就是匿名内部类需要实现哪个接口
3. {...}才是匿名内部类的内容

注意几点问题：
1. 匿名内部类，在【创建对象】的时候，只能使用一次。如果希望多次创建对象，而且类的内容一样，那么就必须使用单独定义的实现类.
2. 匿名对象在【调用方法】的时候，只能调用唯一一次，如果希望同一个对象调用多次方法，那么必须给对象取个名字。
3. 匿名内部类是省略了【实现类/子类】，但是匿名对象是省略了【对象名称】
强调！匿名内部类和匿名对象不是一会事儿！！！
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();
//        MyInterface obj1 = new MyInterface() {
//            @Override
//            public void method() {
//                System.out.println("AAA");
//            }
//        };
        ///使用了匿名内部类，但不是匿名对象，对象名称就叫obj
        MyInterface obj1 = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("AAA1");
            }

            @Override
            public void method2() {
                System.out.println("BBB1");
            }
        };
        obj1.method1();
        obj1.method2();
//        MyInterface obj2 = new MyInterface() {
//            @Override
//            public void method() {
//                System.out.println("BBB");
//            }
//        };
        System.out.println("==================");
        //使用匿名内部类，而且省略了对象名称
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("BBBB1");
            }

            @Override
            public void method2() {
                System.out.println("BBBB2");
            }
        }.method1();
    }


}
