package zyc.day01.demo03;

public class Demo06StringConvert {
    public static void main(String[] args) {
        String str1 = "abHelloWorld";
        char[] ch1 = str1.toCharArray();
        System.out.println("============");
        System.out.println("The address is " + ch1);
        System.out.println(ch1);
        byte[] num = str1.getBytes();
        System.out.println("============");
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println("===========");
        String str2 = "How do you do?";
        System.out.println(str2);
        String str3 = str2.replace("o","*");
        System.out.println(str3);
        System.out.println("=================");
        String lang1 = "会不会玩啊，你大爷的";
        String lang2 = lang1.replace("你大爷的","****");
        System.out.println(lang2);

    }
}
