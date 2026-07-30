package Binary_Search;

public class lac_47 {
    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;

        while(s<=n){
            int mid = s + (e-s)/2;

            if(s==e){ // single element
                return nums[s];
            }
            //non single element
            // check weather mid element is ans or not
            int currentValue = nums[mid];
            int preValue = -1;
            if(mid-1>=0){
                preValue = nums[mid-1];
            }
            int nextVal = -1;
            if(mid+1<n){
                nextVal = nums[mid+1];
            }
            if(currentValue != preValue && currentValue != nextVal ){
                // iska mtlb currentValue hi ans h
                return currentValue;
            }
            if(currentValue != preValue && currentValue == nextVal ){
                int StartingIndexOfPair = mid;
                if((StartingIndexOfPair & 1 ) == 1){
                    // odd h
                    // ans left me hoga
                    e = mid -1;
                }
                else{
                    //even
                    //move to right
                    s = mid+1;
                }
            }
            else if(currentValue == preValue && currentValue != nextVal){
                int endingIndexOfPair = mid;
                if(( endingIndexOfPair & 1 ) == 1){
                    // odd h
                    s = mid +1;
                }
                else{
                    //even

                    e = mid-1;
                }

            }

        }

        return -1;

    }

    static void main(String[] args) {
        int[] nums = {10,20,20,30,30,40,40};
        System.out.println(singleNonDuplicate(nums));

    }
}
