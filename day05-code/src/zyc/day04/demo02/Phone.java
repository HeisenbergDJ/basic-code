package zyc.day04.demo02;
/*
定义一个类，用来模拟 手机 事物

属性：品牌、价格、颜色
行为：打电话、发短信
 */
public class Phone {
    // 品牌名
    String name;
    // 价格
    int price;
    // 颜色
    String color;

    // 打电话
    public void Call(String a){
        System.out.println(a + "电话已经拨打！");
    }
    // 发短信
    public void SendMessage(String str){
        System.out.println("发送的短信为：" + str);
    }
}
