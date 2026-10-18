package Recursion;

public class lec_65 {
    static boolean solve(int[] nums, int i){
        if(i>=nums.length){
            return false;
        }
        if(i == nums.length-1){
            return true;
        }
        if(nums[i] == 0){
            return false;
        }
        boolean overAllAns = false;
        int jumpVal = nums[i];
        for(int jump = 1; jump <= jumpVal; jump++){
            boolean recAns = solve(nums, i+jump);
            overAllAns = overAllAns || recAns;
        }
        return overAllAns;
    }
  static boolean canJump(int[] nums) {
        int i = 0;
        boolean ans = solve(nums,i);
        return ans;
    }
    static void main(String[] args) {
        int[] nums ={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
