package sorting;

public class lac_37 {
    // in sbki time complexity 0(logn) hi h
    // lower bound ka mtlb sbse chota index target
    // ka ya agr target present nhi h to just bdi value ka index ..
    static  int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= target){
                ans = mid;
                e = mid -1;

            }
            else{
                s = mid+1;
            }
        }
        return  ans;
    }


    // upper bound ka mtlb target se just badi value ka index..
    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
         int e = n-1;
         int ans = n;
         while(s<=e){
             int mid = s +(e - s)/2;
             if(arr[mid]<=target){
                 s = mid+1;
             }
             else {
                 ans = mid;
                 e = mid - 1;
             }
         }
         return ans;
    }
    static void main(String[] args) {
//        int[] arr = {1,2,3,3,3,3,3,4,5};
//        System.out.println(getLowerBound(arr,3));

//        int[] arr = { 10,20,30,40,50};
//        System.out.println(getUpperBound(arr,45));



            // find number of occurence mtlb kon sa number kitni bar aaya h mtlb uski freq...
        int[] arr = {10,20,30,30,30,30,30,40,50};
        int target = 30;
        int lowerBound = getLowerBound(arr,target);
        int upperBound = getUpperBound(arr, target);
        int ans = upperBound - lowerBound;
        System.out.println(ans);

    }
}
