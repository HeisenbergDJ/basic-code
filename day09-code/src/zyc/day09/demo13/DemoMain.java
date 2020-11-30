package zyc.day09.demo13;

public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal();//错误，抽象类
//        Dog dog = new Dog();//错误，抽象类
        DogGolden golden = new DogGolden();//正确，普通类可以直接new对象
        golden.sleep();
        golden.eat();
    }
}
