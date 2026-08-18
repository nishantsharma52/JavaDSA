package String;

public class lac_53 {
   static String removeDuplicates(String s) {
        StringBuilder ans  = new StringBuilder();

        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);

            // compare ans ke rightmost chacacter ko current character se
            if(ans.length() > 0 && ans.charAt(ans.length() - 1) == ch){
                ans.deleteCharAt(ans.length() -1);
            }
            else{
                // if these 2 are different char
                ans.append(ch);
            }
        }
        return ans.toString();

    }
    static void main(String[] args) {
       String s = "abbaxy";
        System.out.println(removeDuplicates(s));

    }
}
