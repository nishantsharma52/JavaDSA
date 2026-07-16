package Binary_Search;

public class lac_41 {
    static boolean isValidAnswer(int nums[], int k, long maxPages){
        // check whether mid or maxPages is a valid ans or not
        int studentCount = 1;
        long pages = 0;

        for(int i = 0; i < nums.length; i++){
            if(pages + nums[i] <= maxPages){
                //means current book can be assigned
                //as it is not out of limit
                //then assign
                pages = pages + nums[i];
            }
            else{
                //current student ko current book
                //cannot be assigned wala case
                studentCount++;
                if(studentCount > k || nums[i] > maxPages){
                    return false;
                }
                else{
                    //can assign to new student
                    pages = 0;
                    pages = pages + nums[i];
                }
            }
        }
        return true;
    }
    static int findPages(int[] nums, int k) {

        //to find a valid answer books count must be greater than equals to students present
        if(nums.length < k){
            return -1;
        }
        // code here
        int n = nums.length;
        long s = 0;
        long sum = 0;


        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        long e = sum;

        long ans = -1;

        while(s <= e){
            long mid = s + (e-s) / 2;
            if(isValidAnswer(nums, k, mid)){
                //true wala case
                ans = mid;
                e = mid - 1;
            }
            else{
                //false wala case
                s = mid + 1;
            }
        }
        return (int) ans;
    }

    static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(findPages(nums, 2));
    }
}
