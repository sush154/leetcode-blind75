package containsDuplicate;

import java.util.HashSet;

public class Solution {
    /**
     * Problem
     * @param nums
     * @return
     */


    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        if (nums.length == 2) {
            return nums[0] == nums[1];
        }

        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for(int idx: nums){
            // If it contains duplicate...
            if(!hset.add(idx)){
                return true;
            }
        }
        // Otherwise return false...
        return false;
    }
}
