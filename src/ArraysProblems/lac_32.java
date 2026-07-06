package ArraysProblems;

public class lac_32 {
    static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0; i<n; i++){
            //sum create krte h
            sum = sum + nums[i];
            // max update krte h
            if(sum > max){
//                max = sum;
                max = Math.max(max, sum);
            }
            if(sum<0){
                sum = 0;
            }

        }
        return max;
    }

    static void main() {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
}
