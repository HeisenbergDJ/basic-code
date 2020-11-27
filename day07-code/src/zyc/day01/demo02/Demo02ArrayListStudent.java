package zyc.day01.demo02;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
//        Student stu1 = new Student();
//        Student stu2 = new Student();
//        Student stu3 = new Student();
//        Student stu4 = new Student();

        Student one = new Student("Jack", 20);
        Student two = new Student("Bill",22);
        Student three = new Student("Mark",23);
        Student four = new Student("Mike",24);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i).getName() + " " +list.get(i).getAge());

        }

    }
}
