package zyc.day10.demo07;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开机");
    }

    @Override
    public void close() {
        System.out.println("鼠标关机");
    }

    public void click(){
        System.out.println("点击鼠标");
    }

}
