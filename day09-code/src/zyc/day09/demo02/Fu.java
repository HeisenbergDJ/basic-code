package zyc.day09.demo02;

public class Fu {
    int numFu = 10;
    int num = 100;

    public void methodFu(){
        //使用的是本类当中的num，不会向下找子类
        System.out.println(num);
    }
}
