import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j = 0;
        int[] finals = { -1, -1 };
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    finals[0] = i;
                    finals[1] = j;
                    return finals;
                }
            }
        }
        return finals;
    }
}