package Binary_Search;

public class lac_39 {
    static int findPivotIndex(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(nums[s]<nums[e]){
            return -1;
        }
        while(s<=e){
            int mid = s +(e-s)/2;
            if(nums[mid]<=nums[n-1]){
                e = mid -1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    static int BinarySearch(int[] nums, int s, int e, int target){
        int n = nums.length;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                return  mid;
            } else if (target>nums[mid]) {
                s = mid + 1;

            }
            else{
                e = mid-1;
            }
        }
        return  -1;
    }
    public int search(int[] nums, int target){
//        int[] nums  = {1,2,3,4,5};
        int n = nums.length;
      int pivotIndex = findPivotIndex(nums);

      // if pivotIndex = -1 then arrayy is already sorted
//        int target = 110;
       if(pivotIndex == -1){
           int ans  = BinarySearch(nums , 0 ,n-1, target);
          return ans;
       }
       else{
           // array is not roated sorted
           // array can be divided into l1 l2

           //index of l1 bala part
           int startArray1 = 0;
           int endArray1 = pivotIndex;
           if(target>=nums[startArray1] && target<=nums[endArray1]){
               int ans = BinarySearch(nums,startArray1,endArray1,target);
                return ans;
           }

           // index of l2 bala part
           int startArray2 = pivotIndex + 1;
           int endArray2 = n-1;
           if(target>=nums[startArray2] && target<=nums[endArray2]){
               int ans = BinarySearch(nums, startArray2 ,endArray2, target);
               return ans;
           }

       }
       return -1;

    }
}
