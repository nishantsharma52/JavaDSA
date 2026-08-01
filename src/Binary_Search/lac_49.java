package Binary_Search;

public class lac_49 {
    static int  getFirstOccIndex(int[][] arr, int rowIndex){
        int totalRow = arr.length;
        int totalCol = arr[0].length;
        int target = 1;

        // handle case where there is no 1 inside the row
        if(arr[rowIndex][totalCol-1] == 0){
            // it means therer is no 1 this row
            return  totalCol;
        }
        else{
            // mtlb 1 exist krte h
            int s = 0;
             int e = totalCol -1;
             int ans = -1;
             while(s<=e){
                 int mid = s +(e-s)/2;

                 if(arr[rowIndex][mid] == 0){
                     s = mid+1;
                 }
                 else{
                     ans = mid;
                     e = mid -1;
                 }
             }
             return ans;
        }
    }
    static  int rowWithMaxOnes(int[][] mat){
        int totaRow = mat.length;
        int totalCol = mat[0].length;
        int maxi = -1;
        int maxOneWaliRowIndex = -1;

        // move tot each row
        //and each row find the first occurent
        // using the F.O will calculate the count of 1s
        // update the maxi variable or the ans index variable basis on that
            for(int row = 0; row<totaRow; row++){
                int firstOccIndex = getFirstOccIndex(mat,row);
                // calculate number of 1s in this row
                int oneCount = totalCol - firstOccIndex;
                // update maxi or ans index variable basic on count
                if(oneCount !=0 && oneCount > maxi){
                    // ho skta h ki current row hi ans ho
                    maxi = oneCount;
                    maxOneWaliRowIndex = row;
                }
            }
            return  maxOneWaliRowIndex;
    }
    static void main(String[] args) {
        int[][] mat = {{0,0,0,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};
        System.out.println(rowWithMaxOnes(mat));

    }
}
