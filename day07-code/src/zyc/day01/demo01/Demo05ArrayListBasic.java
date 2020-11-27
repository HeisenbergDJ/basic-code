package zyc.day01.demo01;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(100);
        array.add(200);
        array.add(300);
        array.add(400);
        System.out.println(array);
        int num1 = array.get(0);
        System.out.println(num1);

    }
}
