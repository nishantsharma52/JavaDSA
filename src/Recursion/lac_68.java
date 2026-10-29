package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lac_68 {

    // problem 1

//    static void solve(int[] nums,int index, List<Integer> output,
//                      List<List<Integer>> ans){
//        // base case
//        if(index>=nums.length){
//            // subsequence ready hai output wali list me
//            // isss subsequence ko store krna h ans me
//            ans.add(new ArrayList<>(output));
//            return;
//        }
//        // include- exclude pattern
//        int currVal = nums[index];
//        // include
//        output.add(currVal);
//        solve(nums, index+1, output, ans);
//        // backtracking step
//        output.remove(output.size()-1);
//
//        // exclude
//        solve(nums, index+1, output, ans);
//    }
//  static List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> output = new  ArrayList<>();
//        int index = 0;
//        solve(nums,index,output,ans);
//        return ans;
//
//    }
 // problem 2

    static void solve(int[] nums,int index, List<Integer> output,
                      List<List<Integer>> ans){
        // base case
        if(index>=nums.length){
            // subsequence ready hai output wali list me
            // isss subsequence ko store krna h ans me
            ans.add(new ArrayList<>(output));
            return;
        }
        // include- exclude pattern
        int currVal = nums[index];
        // include
        output.add(currVal);
        solve(nums, index+1, output, ans);
        // backtracking step
        output.remove(output.size()-1);

        // assume currVal = 3
        // 3 3 3 3 3 3 3
        // while excluding, ignore the same element and move on to the new element
        // ye exclude wala logic  1 assumption pr based h

        while(index+1 < nums.length && nums[index] == nums[index+1]){
            index++;
        }

        // exclude
        solve(nums, index+1, output, ans);
    }
 static List<List<Integer>> subsetsWithDup(int[] nums) {
        // sort krna jruri h ye
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new  ArrayList<>();
        int index = 0;
        solve(nums,index,output,ans);
        return ans;

    }
    static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println( subsetsWithDup(nums));
//        System.out.println(subsets(nums));

    }
}
