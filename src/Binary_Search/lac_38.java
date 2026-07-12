package Binary_Search;

public class lac_38 {
    //problem:1

    static int findPeakElement(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid+1;
            }
            else{
                ans = mid;
                e = mid -1;
            }
        }
        return  ans;
    }
    static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        System.out.println(findPeakElement(arr));

    }
}
