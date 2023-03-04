package org.master.leetcode;

import java.util.ArrayList;

public class SearchInsert {

    /**
     * Example 1:
     *
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     *
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * Example 3:
     *
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     *
     * */
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 5;
        int sol = searchInsert(nums, target);
        System.out.println(sol);
    }
    public static int searchInsert(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        int index = 0;
        int found = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
//            System.out.println(list.get(i));


            if (target == nums[i]){
//                System.out.println(i);
                found = i;
            }else if(true){

            }


//            index++;
        }

        return found;

    }
}
