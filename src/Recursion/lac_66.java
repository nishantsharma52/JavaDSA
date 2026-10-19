package Recursion;

import java.util.List;

public class lac_66 {
    static int solve(List<List<Integer>> triangle, int rowIndex, int colIndex){
        if(rowIndex == triangle.size()-1){
            return triangle.get(rowIndex).get(colIndex);
        }
        int downDirection = triangle.get(rowIndex).get(colIndex) + solve(triangle,rowIndex+1, colIndex);
        int diagnolDirection = triangle.get(rowIndex).get(colIndex) + solve(triangle,rowIndex+1, colIndex+1);
        int finalAns = Math.min( downDirection,diagnolDirection);

        return finalAns;

    }
   static int minimumTotal(List<List<Integer>> triangle) {
        int rowIndex = 0;
        int colIndex = 0;
        int ans = solve(triangle,rowIndex,colIndex);
        return ans;
    }
    static void main(String[] args) {

        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        int ans = minimumTotal(triangle);

        System.out.println("Minimum Path Sum = " + ans);
    }
}
