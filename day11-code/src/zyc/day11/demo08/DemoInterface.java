package zyc.day11.demo08;

import java.util.ArrayList;
import java.util.List;
/*
java.util.list 正是 ArrayList所实现的接口！
 */
public class DemoInterface {

    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称！
        List<String> list = new ArrayList<>();//多态写法

        List<String> result = addNames(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("Jack");
        list.add("Bill");
        list.add("Mike");
        list.add("Mark");
        return list;
    }


}
