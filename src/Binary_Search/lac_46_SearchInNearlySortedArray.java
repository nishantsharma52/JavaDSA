package Binary_Search;

public class lac_46_SearchInNearlySortedArray {
    static int findIndexInNearlySortedArray(int[] arr, int k){

        int s = 0;
        int n = arr.length;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == k){
                return mid;
            }
            if( mid > 0 && arr[mid-1] == k){
                return mid-1;
            }
            if( mid < n-1 && arr[mid+1] == k){
                return mid+1;
            }
            if(arr[mid]<k){
                s = mid+2; // optimization ke liye h nhi to s = mid+1; bhi likh skte h
            }
            else{
//                optimization ke liye h nhi to e = mid-1; bhi likh skte h
                e = mid -2;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] arr = {3,5,10,9,11};
        System.out.println(findIndexInNearlySortedArray(arr,10));
    }
}
