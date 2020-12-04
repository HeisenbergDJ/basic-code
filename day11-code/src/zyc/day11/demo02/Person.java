package zyc.day11.demo02;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

//    @Override
//    public boolean equals(Object obj) {
//
//        //判断传递的类型就是本类 可用语法 obj == this ?
//        if (obj == this){
//            return true;
//        }
//
//        if(obj == null){
//            return false;
//        }
//
//        if (obj instanceof Person){
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//        return false;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        //getClass() != o.getClass() 使用的反射技术，判断这个o是否为Person类型，等效于obj instanceof Person
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        return name != null ? name.equals(person.name) : person.name == null;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
