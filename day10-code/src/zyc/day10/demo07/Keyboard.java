package zyc.day10.demo07;

public class Keyboard implements USB{

    @Override
    public void open() {
        System.out.println("键盘开机");
    }

    @Override
    public void close() {
        System.out.println("键盘关机");
    }
    public void type(){
        System.out.println("敲键盘");
    }
}
