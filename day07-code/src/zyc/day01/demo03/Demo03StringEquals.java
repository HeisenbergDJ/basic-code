package zyc.day01.demo03;

/*
public boolean equals(Object obj){}
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        System.out.println("==============");
        String strA = "Java";
        System.out.println("java".equalsIgnoreCase(strA));
        }
}
