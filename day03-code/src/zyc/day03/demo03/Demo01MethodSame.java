package zyc.day03.demo03;
/*
题目要求：定义一个方法，用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(2,5));
        System.out.println(isSame(5,5));
    }
    public static boolean isSame(int a , int b){
/*        boolean same;
        *//*第一种写法
        if (a == b) {
            same = true;
        }else{
            same = false;
        }
        *//*
        *//*第二种写法
        same = a == b ? true : false;
         *//*
        same = a == b;*/
//        boolean same = a == b ;
        return a == b;
    }
}
