package String;

public class lac_51 {
    // problem 1
   static  String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i  = s.length() - 1 ;
        while(i>=0){
            // remove all the tralling spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            // check value of i
            if(i<0){
                break;
            }
            int j = i;
            // find the start index of the world
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            // jaise hi j space wale inedex pr aya to ruk jaega
            //ab iss word ko apne ans me append kedena
            ans.append(s.substring(j+1,i+1));
            // remove faltu ke space where j is standing and add a space in ans

            while(j>=0 && s.charAt(j) == ' '){
                j--;
            }
            // j<0,  iska matlab first word k uppar tha means noo space needed
            //j>=0 space needed
            if(j>=0){
                ans.append(' ');
            }
            // place i at last index of the remaining string
            i = j;
        }
        return ans.toString();

    }

    // problem 2

    static char getMaxOccuringChar(String s){
       int[] freq = new int[26];

       // travese over string and update their freq accordingly
        for(int i = 0; i<s.length(); i++){
            char currChar = s.charAt(i);
            freq[currChar-'a']++;
        }
        int maxFreq = -1;
        char ans = 'a';

        // traverse over the freq array and get the highest freq walla element
        for(int i = 0; i<26; i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+'a');
            }
        }
        return ans;
    }

    static void main(String[] args) {
//       String s = "my name is nishant";
//        System.out.println(reverseWords(s));
        String s = "textsample";
        System.out.println(getMaxOccuringChar(s));
    }
}
