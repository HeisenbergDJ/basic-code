package zyc.day04.demo01;
/*
数组的初始化：在内存当中创建一个数组，并且向其中赋予一些默认值（数组长度在程序运行期间不可改变）

常见的两种初始化方式：
1. 动态初始化（指定长度）
2. 静态初始化（指定内容）

动态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[数组长度];
静态初始化数组的格式：
数据类型[] 数组名称 = new 数据类型[] {元素1，元素2，元素3，...};

使用静态初始化的时候格式还可以省略：
数据类型[] 数组名称 = {元素1，元素2，元素3，...};

注意事项：
1. 标准格式可以拆分成两部分：
   数据类型[] 数组名称；
   new 数据类型[] {元素1，元素2，元素3，...};
2. 省略格式不能拆分成两部分

 */
public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA = new int[300];
        System.out.println(arrayA);
        double[] arrayB = new double[100];
        System.out.println(arrayB);
        String[] arrayC = new String[5];

        int[] arrayD = new int[] {5 , 25, 75};
        String[] arrayE = new String[] {"Hello" , "World" , "Java"};

        int[] arrayF = {5 , 25 , 75};

        int[] arrayG;
        arrayG = new int[300];
    }
}
