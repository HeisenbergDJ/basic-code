package zyc.demo001;

import java.util.HashMap;

public class Demo01ToSum {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
        int[] nums = {11, 15, 2, 7};
        int target = 9;


        //方法一：
        long startTime1 = System.nanoTime();
        int[] a = method01(nums, target);
        System.out.println("i=" + a[0] + " j=" + a[1]);
        long endTime1 = System.nanoTime();
        System.out.println("The time of Method1:" + (endTime1 - startTime1) + "ns");

        System.out.println("============================");

        //方法二：
        long startTime2 = System.nanoTime();
        int[] b = method02(nums, target);
        System.out.println("i=" + b[0] + " j=" + b[1]);
        long endTime2 = System.nanoTime();
        System.out.println("The time of Method2:" + (endTime2 - startTime2) + "ns");

    }

    private static int[] method02(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int []{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];


    }



    private static int[] method01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
