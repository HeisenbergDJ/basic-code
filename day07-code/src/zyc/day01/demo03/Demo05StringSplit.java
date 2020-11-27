package zyc.day01.demo03;
/*
注意事项：
按照英文句点切割必须，regex 必须是"\\." 而不是"."
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,vvv,ddd";
        String[] str2 = str1.split(",");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
        String str3 = "aaa.bbb.ccc";
        String[] str4 = str3.split("\\.");
        for (int i = 0; i < str4.length; i++) {
            System.out.println(str4[i]);

        }
    }
}
