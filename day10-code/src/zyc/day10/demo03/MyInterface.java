package zyc.day10.demo03;
/*
这个子接口当中有几个方法：4个
methodA：来源于接口A
methodB：来源于接口B
methodCommon：来源于接口A、B
method：来源与本接口
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("重写重复默认方法");
    }
}
