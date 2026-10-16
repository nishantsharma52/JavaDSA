package Recursion;

public class lac_64 {
    static int solve(int sum , int target, int[][] mat,int row ){
        if(row>=mat.length){
            return Math.abs(sum-target);
        }
        int mini = Integer.MAX_VALUE;
        for(int num:mat[row]){
            int ans = solve(sum+num, target,mat,row+1);
            mini = Math.min(ans,mini);
        }
        return mini;
    }
  static int minimizeTheDifference(int[][] mat, int target) {
        int row =0;
        int sum = 0;
        int ans = solve(sum,target,mat,row);
        return ans;

    }
    static void main(String[] args) {
       int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
       int target = 13;
        System.out.println(minimizeTheDifference(mat,target));

    }
}
