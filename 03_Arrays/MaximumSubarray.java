// Given an integer array nums, find the subarray with the largest sum, and returns
//  its sum.

// Kadanes algorithm
public class MaximumSubarray {

    static int maxSubarray (int nums[]){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {

            sum = sum + nums[i];

            maxi = Math.max(maxi, sum);

            if(sum < 0) 
                sum = 0;

        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {7,8,-9,1,-3,4,-5,6};
        int ans = maxSubarray(nums);
        System.out.println(ans);
    }
}
