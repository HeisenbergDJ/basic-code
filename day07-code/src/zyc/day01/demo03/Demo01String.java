package zyc.day01.demo03;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("The 1 string is:" + str1);
        char[] CharArray = {'a','b','c'};
        String str2 = new String(CharArray);
        System.out.println(str2);
        byte[] ByteArray = {97,98,99};
        String str3 = new String(ByteArray);
        System.out.println(str3);
        String str4 = "Hello";
        System.out.println(str4);
    }
}
