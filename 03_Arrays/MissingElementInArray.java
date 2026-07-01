// MissingElementInArray of duplicates  
import java.util.ArrayList;
import java.util.List;

class MissingElementInArray {

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // Mark the visited numbers
        for (int index = 0; index < n; index++) {
            int value = Math.abs(nums[index]);
            int position = value - 1;

            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // Find the positive positions
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> ans = findDisappearedNumbers(nums);

        System.out.println(ans);
    }
}