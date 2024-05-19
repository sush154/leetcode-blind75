package twosums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2 && (nums[0] + nums[1] == target)) {
            return new int[]{0,1};
        }

        Map<Integer, Integer> sum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subtract = target - nums[i];
            if (sum.containsKey(subtract)) {
                return new int[]{sum.get(subtract), i};
            }
            sum.put(nums[i], i);
        }
        return new int[] {};
    }
}
