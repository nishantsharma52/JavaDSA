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

    //problem 2

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

    //problem 3

    static int removeDuplicate(int[] arr){
        int i=0;
        int j= 1;
        int n = arr.length;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;

            }
            else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }

    // problem 4

    static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        //freq store
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0) + 1);
            System.out.println(freq);
        }
        for(int i : arr){
            if(freq.get(i) > 1){
                return i;
            }
        }
        //agar koi bhi freq greater than 1 nhi h to return -1;
        return  -1;
    }

    // problem 5
    static int pivotIndex(int[] nums) {
        int n =  nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int [n];
        //file right sum bala array
        leftSum[0] = nums[0];
        for(int i = 1; i<n; i++){
            leftSum[i] = leftSum[i-1] + nums[i];

        }
        // fill right sum bala array
        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i];
        }
        for(int i = 0; i<n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }



    static void main() {
//        problem 1..
//        int[] arr = { 1,2,4,5,6,7};
//        int target = 3;
//        int ans[] = twoSum(arr,target);
////        System.out.println(Arrays.toString(ans));
//        int[] nums = { -1,0,1,2,-1,4};
//        System.out.println(threeSum(nums));
//        int [] arr ={ 1,1,2,2,4,3,5,6,7};
//        System.out.println(removeDuplicate(arr));
//        int[] arr = {1,2,3,1,4,5};
//        System.out.println(findFirstRepeatingElement(arr));
        int[] nums = {1,7,1,5,5,6};
        System.out.println(pivotIndex(nums));


    }
}
