package zyc.day01.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
//            int rnum = new Random().nextInt(34);
//            array.add(rnum);
            array.add(new Random().nextInt(34));
        }
        System.out.println(array);
        for (int i = 0; i < 6; i++) {
            System.out.println(array.get(i));
        }
    }
}
