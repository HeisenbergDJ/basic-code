package zyc.day01.demo02;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("Bill");
        list.add("Mark");
        list.add("Mike");
        ArrayListPrint(list);

    }

    public static void ArrayListPrint(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i) + "}");
            }
            else{
                System.out.print(list.get(i) + "@");
            }
        }
    }

}
