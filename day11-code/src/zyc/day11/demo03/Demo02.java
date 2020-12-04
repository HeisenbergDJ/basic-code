package zyc.day11.demo03;

public class Demo02 {

    public static void main(String[] args) {

        String s1 = "aaa";
        String s2 = "aaa";
        System.out.println(s1.equals(s2));

        Student stu1 = new Student("Bill", 18);
        Student stu2 = new Student("BIll", 18);
        System.out.println(stu1.equals(stu2));
    }

}
