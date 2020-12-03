package zyc.day10.demo01;

public class MyInterfaceDefaultA implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法AAA");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类A重写接口的默认方法");
    }
}
