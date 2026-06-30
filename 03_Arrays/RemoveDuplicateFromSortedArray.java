public class RemoveDuplicateFromSortedArray {
    static int removeDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        int n = nums.length;

        while(j<n) {
            if(nums[i] == nums[j]) {
                j++;
            }
            else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int []nums = {-20,-20,-16,-10,-2,-1,4,8,9,10,12,20};
        int ans = removeDuplicate(nums);
        System.out.println(ans);
    }
}
