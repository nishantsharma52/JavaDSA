package Binary_Search;

public class lac_45_RotiPrathaProblem {
    // yha mid = timeLimit h ;
    static boolean isValidAns(int[] cook, int p ,int n, int mid){
    int prathaCount = 0;
    // ek ek krke haar 1 cook ke pass jaege
        for(int i = 0; i<cook.length; i++){
            int currentCookRank = cook[i];
            int timeTaken = 0;
            int j = 1;
//            currentCookRank R   hai
//            1*R, 2*R, 3*R
//            cook krna start kro
            while(timeTaken<=mid) {
                    if(timeTaken + j*currentCookRank <= mid){
                        // iska mtlb me pratha bna skta hu
                        timeTaken = timeTaken + j*currentCookRank;
                        prathaCount++;
                        j++;

                    }
                    else{
                        break;
                    }
            }

        }
        if(prathaCount>=p){
            return true;
        }
        else{
            return  false;
        }
    }
    static int minTimeToCookPratha(int[] cook, int p ,int n){
        //  p-> number of pratha to cook
        //  n-> numbers of cooks
        int s = 0;
        int maxRank = -1;
        for(int i = 0 ; i<cook.length; i++){
            if(cook[i] > maxRank){
                maxRank = cook[i];
            }
        }
        // e = R(n(n+1)/2; ye end nikalne ka formula h
        int e = maxRank*(p*(p+1)/2);
        int ans = -1;
        while(s<=e){
            int mid = s +(e-s)/2;

            if(isValidAns(cook,p,n, mid)){
                ans = mid;
                e = mid -1;

            }
            else{
                s = mid+1;
            }
        }
        return  ans;
    }
    static void main(String[] args) {
        int[] cook = {1,2,3,4};
        System.out.println(minTimeToCookPratha(cook, 10, 4));

    }
}
