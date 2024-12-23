import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] value = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {  // Start j from i + 1 to avoid duplicates
                if (target == nums[i] + nums[j]) {
                    value[0] = i;
                    value[1] = j;
                    return value;  // Return immediately once the solution is found
                }
            }
        }
        return value;  // Return the pair, or an empty array if no pair is found
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
