package Recursion;

public class lec_63 {
    static boolean solve(int target, int[] nums, int i){
        if(i>= nums.length){
            return false;
        }
        if(target == 0){
            return true;
        }
        if(target<0){
            return false;
        }
        boolean includeKaAns = solve(target-nums[i] , nums, i+1 );
        boolean excludeKaAns = solve(target, nums, i+1);
        return includeKaAns || excludeKaAns;

    }
  static boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum = sum+num;
        }
        if((sum&1) == 1){
            return false;
        }
        int i = 0;
        int target = sum/2;
        boolean ans = solve(target,nums, i);
        return ans;

    }
    static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));

    }
}
