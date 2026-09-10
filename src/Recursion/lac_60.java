package Recursion;

public class lac_60 {
    static int solve(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        int in  = nums[i] + solve(nums,i+2);
        int ex = 0 + solve(nums, i+1);
        int finalAns = Math.max(in,ex);
        return finalAns;
    }
   static int rob(int[] nums) {
        int  i = 0;
        int ans = solve(nums, i);
        return ans;

    }
    static void main(String[] args) {
        int nums[]  = {1,2,3,4};
        System.out.println(rob(nums));

    }
}
