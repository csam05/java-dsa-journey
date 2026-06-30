
// find  the one that is different from the array.
public class MissingNumber {
    static int missingNumber(int[] nums) {
        int xorSum = 0;

        for(int n:nums) {
            xorSum = xorSum ^ n;
        }

        int n = nums.length;
        for(int i=0; i<=n; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int nums[] = {5,6,0,2,4,1,8,7};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }   
}
