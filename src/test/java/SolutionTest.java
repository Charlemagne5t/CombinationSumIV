import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum4Test1() {
        int[] nums = {1, 2, 3};
        int target = 4;
        int output = 7;
        Assert.assertEquals(output, new Solution().combinationSum4(nums, target));
    }

    @Test
    public void combinationSum4Test2() {
        int[] nums = {9};
        int target = 3;
        int output = 0;
        Assert.assertEquals(output, new Solution().combinationSum4(nums, target));
    }
    @Test
    public void combinationSum4Test3() {
        int[] nums = {5, 1, 8};
        int target = 24;
        int output = 982;
        Assert.assertEquals(output, new Solution().combinationSum4(nums, target));
    }
    @Test
    public void combinationSum4Test4() {
        int[] nums = {2, 1, 3};
        int target = 35;
        int output = 1132436852;
        Assert.assertEquals(output, new Solution().combinationSum4(nums, target));
    }


}
