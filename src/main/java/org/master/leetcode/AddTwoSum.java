package org.master.leetcode;

public class AddTwoSum {
    /**
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     */


    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * */
    public static void main(String[] args) {

        int [] exampleNums = {3,2,4};
        int exampleTarget = 6;

        int [] exampleNums2 = {2,7,11,15};
        int exampleTarget2 = 9;

        int[] testArr =  twoSum(exampleNums2, exampleTarget2);

        for (int i = 0; i < testArr.length; i++) {
            System.out.println(testArr[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] newArr = new int[2];

        int fark = 0;
        for (int i = 0; i < nums.length; i++) {
            fark = target - nums[i]; // 6 - 3 = 3
            //System.out.println(i);
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] == fark){
                    //System.out.println(i);
                    //System.out.println(j);
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }


        }



        return newArr;
    }

}

