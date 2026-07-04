package ArraysProblems;

import java.util.*;

public class lac_30 {
    //problem 1
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j= i+1; j<=n-1; j++){
                if(arr[i] + arr[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return  ans;
    }

    static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> output = new HashSet<>();
        for(int i = 0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        output.add(temp);
                    }
                }

            }
        }
        return new ArrayList<>(output);
    }

    static void main() {
//        problem 1..
//        int[] arr = { 1,2,4,5,6,7};
//        int target = 3;
//        int ans[] = twoSum(arr,target);
//        System.out.println(Arrays.toString(ans));
        int[] nums = { -1,0,1,2,-1,4};
        System.out.println(threeSum(nums));

    }
}
