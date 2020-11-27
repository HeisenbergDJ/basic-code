package zyc.day01.demo01;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bill");
        list.add("Jack");
        list.add("Mike");
        list.add("Mark");
        list.add("Dick");
        System.out.println(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String name = list.get(i);
            System.out.println("The " + (i+1) +" people is " + name);
        }

    }
}
