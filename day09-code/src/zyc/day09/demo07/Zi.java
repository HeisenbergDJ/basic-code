package zyc.day09.demo07;

public class Zi extends Fu {
    public Zi() {
//        super();//编译器免费赠送的，不写也有
        super(10);
        System.out.println("子类构造方法执行");
    }
    public void method(){
//        super();//错误写法！只有子类构造方法，才能调用父类构造方法。
    }
}
