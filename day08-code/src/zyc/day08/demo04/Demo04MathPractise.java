package zyc.day08.demo04;
/*
题目：
计算在 -10.8 到 5.9 之间，绝对值大于6，或者小于2.1的整数的个数。

备注：如果使用Math.ceil方法，-10.8可以变成-10.0.注意double类型也可以进行++的。
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int Low = (int)-10.8;
        int Up = (int)5.9;
        int numCounter = 0;
        for (int i = Low; i <= Up; i++) {
            int num = Math.abs(i);
            if(num > 6 || num < 2.1){
                numCounter++;
                System.out.println(i);
            }
        }
        System.out.println("The number is " + numCounter);

    }
}
