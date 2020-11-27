package zyc.day03.demo02;
/*
方法的定义格式：
public static void 方法名称(){
    方法体;
}

方法的调用格式：
方法名称();

注意事项：
1.  方法定义的先后顺序无所谓
2.  不能在方法的内部定义方法
 */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();

    }
    public static void printMethod(){
        for (int i = 1; i <= 4 ; i++) {
            for (int j = 0; j < 20 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

