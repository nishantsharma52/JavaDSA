package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lac_59 {
    static void getAllSubsequences(String s,int i , StringBuilder output , List<String> ans){
        // base case
        if(i>= s.length()){
            String subsequence = output.toString();
            ans.add(subsequence);
            return;
        }
        // 1 case solve krege baki recursion sambhal lega
        char ch = s.charAt(i);
        // include
        output.append(ch);
        getAllSubsequences(s,i+1,output,ans);
        //exclude
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s , i+1, output,ans);

    }
    static List<String> powerSet(String s){
    List<String> ans = new ArrayList<>();
    StringBuilder output = new StringBuilder();
    int i = 0;
    getAllSubsequences(s,i,output,ans);
        Collections.sort(ans);
        return ans;
    }
    static void main(String[] args) {
        String s = "abc";
        System.out.println(powerSet(s));

    }
}
