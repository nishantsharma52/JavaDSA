package ArraysProblems;

public class lac_27 {
//        static  double getAverage(int[] arr){
//           double sum = 0;
//            for(int i : arr){
//                sum = sum + i;
//            }
//            int size = arr.length;
//            double avg = sum/size;
//            return avg;
//        }

//        static int[] multiplyBy10(int arr[]){
//            int size = arr.length;
//            int newArray[] = new int[size];
//
//            for(int i=0; i<size;i++){
//                int element = arr[i];
//                int newElement = element*10;
//                newArray[i] = newElement;
//            }
//            return newArray;
//        }

//            static boolean findTarget(int arr[], int target){
//                for(int i = 0; i<arr.length; i++){
//                    if(arr[i] == target){
//                        return  true;
//                    }
//                }
//                //agr poora array travel ho chuka hai
//                //and ek varr bhi target nhi mila
//                //iska mtb target is not present in array
//                return  false;
//            }
//
//    static  int getMaximum(int arr[]){
//        int max = arr[0];
//
//        for(int i=0; i<arr.length; i++){
////            if(arr[i]>max){
////                max = arr[i];
////            }
//            max = Math.max(arr[i],max);
//        }
//        // jab main yaha pohcuga to poora array compare ho chuka hoga and max k andr saabse badi value hogi
//        return max;
//    }

//        static int[] getPosNegSum(int arr[]){
//                int posSum = 0 ;
//                int negSum = 0;
//                for(int i=0; i< arr.length; i++){
//                    if(arr[i]>0){
//                        posSum = posSum + arr[i];
//                    }
//                    else {
//                        negSum = negSum + arr[i];
//                    }
//                }
//                int ans[] = {posSum, negSum};
//                return  ans;
//
//        }

//        static int [] getZeroOneCount(int[] arr){
//            int zeroCount = 0;
//            int oneCount = 0;
//            for(int i=0; i<arr.length;i++){
//                if(arr[i] == 0){
//                    zeroCount++;
//                }
//                else{
//                    oneCount++;
//                }
//            }
//            int[] ans = {zeroCount,oneCount};
//            return ans;
//        }

        static int getUnsortedElement(int[] arr){
          for(int i=0; i<arr.length; i++){
                if(arr[i+1]<=arr[i]){
                    return arr[i+1];
                }
    }
          return -1;
        }


    static  void main(){
    int[] arr = { 1,2, 1,5,4,8,9};
        System.out.println(getUnsortedElement(arr));
//
//    int arr [] = { 0,1,0,0,1,1,0,0,0,1,1,};
//    int ans[] = getZeroOneCount(arr);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
//        int[] arr = {2,4,3,3};
//        System.out.println(getAverage(arr));

//        int arr[] = {1,2,3,4,5};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("printing ans array: " );
//        for (int i : ans){
//            System.out.println(i);
//        }
//        int arr[] = { 1,4,5,3,2};
//        boolean ans =  findTarget(arr, 9);
//        System.out.println(ans);
//        int arr[] = { 1,4,300,5,6,90};
//        System.out.println(getMaximum(arr));
//        int arr[] = {2,-5,3,9,-7};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive sum = " + ans[0]);
//        System.out.println("Negative sum = " + ans[1]);


    }

}
