package zyc.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

//用户子类
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> redlist){
        int index = new Random().nextInt(redlist.size());
        int delta = redlist.remove(index);
        super.setMoney(delta + super.getMoney());
    }
}
