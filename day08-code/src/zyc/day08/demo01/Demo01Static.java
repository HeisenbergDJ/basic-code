package zyc.day08.demo01;
/*
如果一个成员变量使用static关键字，那么这个变量不再属于对象自己，而属于所在的类
 */
public class Demo01Static {
    public static void main(String[] args) {

        Student stu1 = new Student("Bill",18);
        stu1.room = "101";
        System.out.println("Name: " + stu1.getName() + " Age: "
                + stu1.getAge() + " Room: " + stu1.room + " ID: " + stu1.getId());
        Student stu2 = new Student("Jack",20);
        System.out.println("Name: " + stu2.getName() + " Age: "
                + stu2.getAge() + " Room: " + stu2.room + " ID: " + stu2.getId());
        Student stu3 = new Student("Mark",30);
        System.out.println("Name: " + stu3.getName() + " Age: "
                + stu3.getAge() + " Room: " + stu3.room + " ID: " + stu3.getId());

    }
}
