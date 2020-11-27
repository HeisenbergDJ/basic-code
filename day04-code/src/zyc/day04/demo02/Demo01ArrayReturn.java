package zyc.day04.demo02;

/*
一个方法可以有多个参数，但只能有0或1个返回值，不能有多个返回值
如果希望一个方法当中产生了多个结果数据进行返回，使用数组作为返回值即可
 */
public class Demo01ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10, 20, 30);
        System.out.println(result);
        System.out.println("总和：" + result[0]);
        System.out.println("平均数：" + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        //数组保存多个值；
//        int[] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        //
        int[] array = {sum, avg};
        return array;
    }
}
