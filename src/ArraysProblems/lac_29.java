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


    static void main() {
        int arr[] = {1, 0, 1, 0, 0, 1, 0};
        int ans[] = sortArray(arr);
        System.out.println(Arrays.toString(ans));

    }
}
