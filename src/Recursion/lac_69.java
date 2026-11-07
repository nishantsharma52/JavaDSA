package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lac_69 {
//   +++++++++++++++++++++++ problem 1   Combination Sum +++++++++++++++++++
//    static void solve(int[] candidates, int target,int index, List<List<Integer>> ans, List<Integer> output ){
//        if(target == 0){
//            ans.add(new ArrayList(output));
//            return;
//        }
//        if(index>=candidates.length){
//            return;
//        }
//        if(target<0){
//            return;
//        }
//        // include exclude
//        output.add(candidates[index]);
//        solve(candidates,target-candidates[index], index,ans,output);
//        output.remove(output.size()-1);
//
//        // exclude
//        solve(candidates,target, index+1,ans,output);
//    }
//   static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> output = new ArrayList<>();
//        int index = 0;
//        solve (candidates,target,index,ans ,output);
//        return ans;
//    }

//    problem 2  Combination Sum 2

    static void solve(int[] candidates, int target,int index, List<List<Integer>> ans, List<Integer> output ){
        if(target == 0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        // include exclude
        output.add(candidates[index]);
        solve(candidates,target-candidates[index], index+1,ans,output);
        output.remove(output.size()-1);

        while(index+1 < candidates.length && candidates[index] == candidates[index+1]){
            index++;
        }

        // exclude
        solve(candidates,target, index+1,ans,output);
    }
   static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve (candidates,target,index,ans ,output);
        return ans;
    }
//     program 3
    static void solve(int[] candidates, int target,int index, List<List<Integer>> ans, List<Integer> output,int count,int k ){
        if(count>k){
            return;
        }

        if( count == k &&  target == 0){
            ans.add(new ArrayList(output));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        // include exclude
        output.add(candidates[index]);
        solve(candidates,target-candidates[index], index+1,ans,output,count+1, k);
        output.remove(output.size()-1);

        while(index+1 < candidates.length && candidates[index] == candidates[index+1]){
            index++;
        }

        // exclude
        solve(candidates,target, index+1,ans,output,count,k);
    }
   static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        int target = n;
        int[] candidates = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        solve (candidates,target,index,ans ,output,count,k);
        return ans;
    }
    
    static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
//        System.out.println(combinationSum(candidates,target));
        System.out.println(combinationSum2(candidates,target));

    }
}
