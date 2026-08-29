package String;

public class lac_53 {
    // problem 1
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

    // ++++++++++ problem 2 ++++++++++++
    static int compress(char[] chars) {
       int readIndex = 0;
       int writeIndex = 0;
       while (readIndex < chars.length){
           char currentChar = chars[readIndex];
           int count = 0;
            // count duplicate char ko
           while(readIndex < chars.length && currentChar == chars[readIndex]){
               readIndex++;
               count++;
           }
           // ab mere pass current char and uska count dono available h
            chars[writeIndex] = currentChar;
           writeIndex++;

           // now insert the count
           if(count>1){
               String countStr = String.valueOf(count);
               for(char digit: countStr.toCharArray()){
                   chars[writeIndex] = digit;
                   writeIndex++;
               }
           }
       }
       return  writeIndex;

    }
    static void main(String[] args) {
       String s = "abbaxy";
        System.out.println(removeDuplicates(s));

    }
}
