package zyc.day11.demo02;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Person p1 = new Person("Bill", 18);
        Person p2 = new Person("Bill", 18);
        System.out.println(p1.equals(p2));

        Random r = new Random();
        System.out.println(p1.equals(r));
        System.out.println(p1.equals(null));
        System.out.println(p1.equals(p1));
    }
}
