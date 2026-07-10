package Binary_Search;

public class lac_36 {
    // binary search ki time complexity o(logn) hoti h
    static  int binarySearch(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target) {
                start = mid + 1;

            }
            else {
                end = mid-1;
            }
            mid =start + (end-start)/2;
        }
        return -1;
    }
    static void main() {
        int[] nums = {1,3,5,6,8,9};
        System.out.println(binarySearch(nums, 10));

    }
}
