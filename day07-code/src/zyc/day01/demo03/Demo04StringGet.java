package zyc.day01.demo03;
/*
public int length()
public
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "fdsfsfsf".length();
        System.out.println("The length is " + length);
        String str1 = "Hello ";
        String str2 = "World";
        System.out.println(str1.concat(str2));

        char ch1 ="Hello".charAt(0);
        System.out.println(ch1);

        int index = "Hello".indexOf("lo");
        System.out.println(index);


    }
}
