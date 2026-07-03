package ArraysProblems;

import java.util.Arrays;

public class lac_29 {

    // problem 1

    static int[] sortArray(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;

            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
            j--;
           }
            }
        return arr;
    }
    // problem 2
    static int missingNumber(int[] arr){
        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
//            System.out.print(n + " " );
            System.out.println(xorSum + " ");
        }
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    //Problem-3
    static int uniqueElement(int[] arr){
        int unique = 0;
        for (int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }



    static void main() {
//        int arr[] = {1, 0, 1, 0, 0, 1, 0};
//        int ans[] = sortArray(arr);
//        System.out.println(Arrays.toString(ans));

//        int arr[] = { 1,1,2,2,3,3,4,};
//        System.out.println(uniqueElement(arr));


//
        int arr[] = {0, 1, 2, 3, 7, 5, 6};
        System.out.println(missingNumber(arr));

    }
}
