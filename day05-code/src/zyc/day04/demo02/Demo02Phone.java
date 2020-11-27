package zyc.day04.demo02;

public class Demo02Phone {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.name = "iphone12";
        iphone.color = "金色";
        iphone.price = 3888;
        System.out.println(iphone.name+iphone.color+iphone.price);
        iphone.Call("1213135486");
        iphone.SendMessage("Hello world!!!");
    }
}
