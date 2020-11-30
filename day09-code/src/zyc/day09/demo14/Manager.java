package zyc.day09.demo14;

import java.util.ArrayList;

//群主子类
public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        //首先一个集合，用来储存若干个红包
        ArrayList<Integer> redlist = new ArrayList<>();

        //首先看一下群主自己有多少钱
        int leftMoney = super.getMoney();
        if(leftMoney < totalMoney){
            System.out.println("余额不足");
            return redlist;//返回空集合
        }

        //扣钱，其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要平均拆分成count份 除不尽的放在最后一个红包
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        //把红包放在一个集合中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;   //最后一个红包
        redlist.add(last);


        return redlist;
    }
}
