package zyc.day10.demo07;

public class Laptop {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }else if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }
        usb.close();
    }
}
