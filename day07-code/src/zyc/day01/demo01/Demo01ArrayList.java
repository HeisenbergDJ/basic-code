package zyc.day01.demo01;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Bill");
        System.out.println(list);
        list.add("Jack");
        list.add("Role");
        System.out.println(list);
    }
}
