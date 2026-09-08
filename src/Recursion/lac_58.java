package Recursion;

public class lac_58 {
    static int solve(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(nums[mid] == target){
            return mid;
        } else if (nums[mid]<target) {
            s = mid+1;
        }
        else{
            e = mid -1;
        }
       return solve(nums, target,s,e);
    }
    static  int search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        int ans = solve(nums, target, s ,e);
        return  ans;
    }
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int target  = 8;
        System.out.println(search(nums,target));

    }
}
