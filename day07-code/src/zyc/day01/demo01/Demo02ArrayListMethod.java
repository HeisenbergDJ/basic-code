package zyc.day01.demo01;

import java.util.ArrayList;

/*
Method:
public boolean add(E, e);
public E get (int index);
public E remove(int index);
public int size();
 */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        boolean success = list.add("Bill");
        System.out.println(list);
        System.out.println("Input: " + success);
        list.add("Jack");
        list.add("Mark");
        list.add("Cindy");
        list.add("Mike");
        System.out.println(list);
        String name = list.get(2);
        System.out.println("The 3 is: " + name);

        String whoremoved = list.remove(3);
        System.out.println("The removed guy is " + whoremoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("The length of array is " + size);
    }
}
