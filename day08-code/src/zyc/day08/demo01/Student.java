package zyc.day08.demo01;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 1;


    public Student() {
        this.id = idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id  = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
}
