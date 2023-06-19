import java.util.*;

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return dfs(nums, target, memo);

    }

    private int dfs(int[] nums, int target, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        if (target < 0) {
            return 0;
        }
        if (target == 0) {
            return 1;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += dfs(nums, target - nums[i], memo);
        }
        memo.put(target, result);
        return result;
    }
}


