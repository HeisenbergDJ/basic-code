package zyc.day01.demo03;

import java.util.HashSet;
import java.util.Iterator;

public class temp {
    public static void main(String[] args) {
        int[] a = {1, 1, 22, 7, 2, 3, 4, 5, 2, 122, 3, 1, 5, 9, 8, 5, 6};
        HashSet set = new HashSet();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        Iterator item = set.iterator();
        while (item.hasNext()) {
            System.out.print(item.next() + "  ");
        }
    }
}
