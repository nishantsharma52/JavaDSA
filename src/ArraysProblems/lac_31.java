package ArraysProblems;

import java.util.ArrayList;
import java.util.List;

public class lac_31 {

    static List<Integer> findDisappearedNumbers(int[] arr){
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        //Marking
        for(int i = 0; i<n; i++){
            int value = Math.abs(arr[i]);
            int position = value-1;
            //mark kr do agr positive h to
            if(arr[position]>0){
                arr[position] = - arr[position];
            }
        }
        // array travel kro or agr value positive h to i+1 add kr do
        for(int i = 0; i<n; i++){
            if(arr[i]>0){
                ans.add(i+1);
            }
        }
        return  ans;

    }
    static void main() {
        int[] arr = {1,4,4,5,2,2};
        System.out.println(findDisappearedNumbers(arr));

    }
}
