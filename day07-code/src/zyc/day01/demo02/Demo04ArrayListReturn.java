package zyc.day01.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {

        ArrayList<Integer> big = new ArrayList<>();
        Random r = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            big.add(r.nextInt(30));
        }
        System.out.println(big);
        ArrayList<Integer> small = getSmallList(big);
        System.out.println(small);
        System.out.println("The length of list " + small.size());
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> small = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = list.get(i);
            if(num % 2 == 0){
                small.add(num);
            }
            else {
            }
        }
        return small;
    }

}
