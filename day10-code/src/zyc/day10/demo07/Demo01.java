package zyc.day10.demo07;

public class Demo01 {
    public static void main(String[] args) {
        Laptop one = new Laptop();
        one.powerOn();
        //准备一个鼠标
        //首先向上转型
        USB usb = new Mouse();
        one.useDevice(usb);
        //准备一个键盘
        USB usb1 = new Keyboard();
        one.useDevice(usb1);
        one.powerOff();
    }
}
