package zyc.day04.demo01;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值

访问数组元素的格式：数组名称[索引值]

注意事项：
1. 索引值从0开始，一直到数组长度减1为止
2. 动态初始化，数组自动拥有默认值为0 , 0.0 , ‘\u0000’ , false , null ,
3. new出的数组存储在堆(Heap)中，方法进栈(Stack)执行，变量名称储存数组的内存地址，方法(Method Area)区储存方法基本信息。
4. 所有的引用类型变量可以赋值为null值。
 */
public class Demo02ArrayUse {
    public static void main(String[] args) {
        int[] arrayA = {10 , 20 , 30};
        System.out.println(arrayA[0]);
        int[] arrayB = new int[300];
        System.out.println(arrayB[200]);
        char[] arrayC = new char[200];
        System.out.println(arrayC[100]);
        arrayB[1] = 123 ;
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        arrayA[0] = 50 ;
        System.out.println(arrayA[0]);
        System.out.println("==============");
        int[] arrayD = {10 , 20 , 30};
        int[] arrayE = arrayD; //将arrayD的地址赋值给arrayE;
        System.out.println(arrayE[0]);
        System.out.println("==============");
        int[] arrayF = null;
        System.out.println(arrayF[0]);//Exception(异常): NullPointerException(空指针异常)
    }
}
