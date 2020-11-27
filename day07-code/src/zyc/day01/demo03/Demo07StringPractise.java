package zyc.day01.demo03;

public class Demo07StringPractise {
    public static void main(String[] args) {
        int[] array = {1 , 2 , 3, 4};
        String str = Method01(array);
        System.out.println(str);

    }
    public static String Method01 (int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                str += "word" + array[i] + "]";
            }
            else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
