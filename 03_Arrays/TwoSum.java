// Given an array of integres nums and an integer target ,
// your task is to find that the sum of two integers inn an array is equal to target

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        System.out.println("Indices: " + ans[0] + " " + ans[1]);
    }
}