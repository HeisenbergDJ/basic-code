package zyc.day09.demo14;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Bill",100);
        manager.show();
        Member Jack = new Member("Jack",100);
        Member Mark = new Member("Mark",10);
        Member Mike = new Member("Mike",10);
        Jack.show();
        Mark.show();
        Mike.show();
        //开始发红包
        ArrayList<Integer> redlist = new ArrayList<>();
        redlist = manager.send(20,3);
        Jack.receive(redlist);
        Mark.receive(redlist);
        Mike.receive(redlist);
        //展示结果
        System.out.println("===============");
        manager.show();
        Jack.show();
        Mark.show();
        Mike.show();
    }
}
