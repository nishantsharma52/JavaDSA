package Binary_Search;

public class lac_39 {
    static int findPivotIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(arr[s]<arr[e]){
            return -1;
        }
        while(s<=e){
            int mid = s +(e-s)/2;
            if(arr[mid]<=arr[n-1]){
                e = mid -1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = { 50,60,70,10,20,30,40};
        System.out.println(findPivotIndex(arr));

    }
}
