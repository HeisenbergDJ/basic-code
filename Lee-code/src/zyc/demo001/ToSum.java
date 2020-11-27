package zyc.demo001;

import java.util.HashMap;
import java.util.Map;

public class ToSum {
    public static void main(String[] args) {
        int[] array = {1, 11, 12, 12, 22, 7, 2};
        int target = 9;
        int[] result1 = new int[2];
        long startTime1 = System.nanoTime();
        result1 = Method01(array, target);
        long endTime1 = System.nanoTime();
        System.out.println("The time of Method1:" + (endTime1 - startTime1) + "ns");
        System.out.println("The index of first num " + result1[0]);
        System.out.println("The index of first num " + result1[1]);
        int[] result2 = new int[2];
        long startTime2 = System.nanoTime();
        result2 = Method02(array, target);
        long endTime2 = System.nanoTime();
        System.out.println("The time of Method2:" + (endTime2 - startTime2) + "ns");
        System.out.println("The index of first num " + result2[0]);
        System.out.println("The index of first num " + result2[1]);
        System.out.println("=======================");
        int[] result3 = new int[2];
        long startTime3 = System.nanoTime();
        result3 = Method03(array, target);
        long endTime3 = System.nanoTime();
        System.out.println("The time of Method3:" + (endTime3 - startTime3) + "ns");
        System.out.println("The index of first num " + result3[0]);
        System.out.println("The index of first num " + result3[1]);
        int[] result4 = new int[2];
        long startTime4 = System.nanoTime();
        result4 = Method04(array, target);
        long endTime4 = System.nanoTime();
        System.out.println("The time of Method4:" + (endTime4 - startTime4) + "ns");
        System.out.println("The index of first num " + result4[0]);
        System.out.println("The index of first num " + result4[1]);
    }

    public static int[] Method01(int[] array, int target) {
        int[] result = new int[2];
        a:
        for (int i = 0; i < array.length; i++) {
            b:
            for (int j = i + 1; j < array.length; j++) {
                if (target == array[i] + array[j]) {
                    result[0] = i;
                    result[1] = j;
                    break a;
                }
            }
        }
        return result;
    }

    public static int[] Method02(int[] array, int target) {
        int[] result = new int[2];
        int[] temp = new int[4];
        a:
        for (int i = 0; i < array.length; i++) {
            temp[i] = Math.abs(array[i] - target);
            b:
            for (int j = i; j > 0; j--) {
                if (temp[i] == temp[j]) {
                    break a;
                }
            }
        }
        return result;
    }

    public static int[] Method03(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] Method04(int[] nums, int target) {

        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(hashtable.containsKey(target - nums[i])){
                return new int[]{
                        hashtable.get(target - nums[i]), i
                };
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
