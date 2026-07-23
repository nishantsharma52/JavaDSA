package Binary_Search;

import java.util.Arrays;

public class lac_43 {
    static boolean isValidAns(int[] position, int m, int minDistance ){
        int cowCount = 1;
        int lastPosition = 0;

        for(int i=1; i<position.length; i++){
            if(position[i]-position[lastPosition] >= minDistance){
                cowCount++;
                lastPosition = i;
                if(cowCount == m){
                    return true;
                }
            }
        }
        return false;
    }
    static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int s = 0;
        int e = position[n-1] - position[0];
        int ans = -1;

        while(s<=e){
            int mid = s +(e-s)/2;

            if(isValidAns(position , m, mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] position = {1,2,4,8,9};
        int m = 3;
        System.out.println(maxDistance(position,m));

    }
}
