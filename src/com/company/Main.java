package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            /*  int[] arr= new int[]{1,2,3,4,5,6};
	          rotate(arr, 2);
             for(int i=0; i< arr.length; i++){
                 System.out.println(arr[i]);
             }*/
        int i =1;
        System.out.println(i/2);


    }

    private static  void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];
        System.arraycopy(nums, 0, copy, 0, nums.length);
        for(int i=0; i<copy.length; i++){
           nums[(i+k)%nums.length] = copy[i];
        }
    }

    private static  void rotate1(int[] nums, int k) {
        if (nums == null || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }




}
