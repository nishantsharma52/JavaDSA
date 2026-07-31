package Binary_Search;

public class lac_48 {
    // problem 1
    // search in 2D matrix
    // jab kisi bhi row ka 1st element bda ho last row ke last element se
    // mtlb jb sorted array bn jae 1D

    static boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int n = totalRow * totalCol;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int rowIndex = mid/totalCol;
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            if(matrix[rowIndex][colIndex] < target){
                s = mid+1;
            }
            if(matrix[rowIndex][colIndex] >target){
                e = mid-1;
            }

        }
        return false;
    }

    // problem 2
    // jb row bhi sort ho or col bhi sort ho
    static boolean searchMatrixx(int[][] matrix, int target){
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int row = 0;
        int col = totalCol-1;

        while(row < totalRow && col>=0){
            if(matrix[row][col] == target){
                return  true;
            } else if (matrix[row][col]> target) {
                col--;

            }
            else{
               row++;
            }

        }
        return  false;
    }
    static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,1,2,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrixx(matrix,13));
    }
}
