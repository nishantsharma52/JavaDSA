package String;

public class lac_52 {
//    static String removeOccurences(String s, String part){
//        // kab tak same 2 steps krenge
//        // jav takk part exist krte h s string me
//        while (s.contains(part)){
//            // search part inside s
//            int index = s.indexOf(part);
//            // create a new string by merging the left
//            // and right part of dound substring inside s string
//            s = s.substring(0,index) + s.substring((index+part.length()));
//        }
//        return  s;
//    }

    // program 2
    // Compare frequency arrays
    static boolean compareFreq(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        // Frequency table of s1
        int[] count1 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            count1[ch - 'a']++;
        }

        int windowLength = s1.length();

        // Frequency table of first window of s2
        int[] count2 = new int[26];
        for (int i = 0; i < windowLength; i++) {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        // Check first window
        if (compareFreq(count1, count2)) {
            return true;
        }

        // Sliding Window
        int i = windowLength;

        while (i < s2.length()) {

            // Add new character
            char newChar = s2.charAt(i);
            count2[newChar - 'a']++;

            // Remove old character
            char oldChar = s2.charAt(i - windowLength);
            count2[oldChar - 'a']--;

            // Compare frequency tables
            if (compareFreq(count1, count2)) {
                return true;
            }

            i++;
        }

        return false;
    }

    static void main(String[] args) {
//        String s = "pqxpqypqz";
//        String part = "pq";
//        System.out.println(removeOccurences(s,part));
        String s1 = "ab";
        String s2 = "hlfoabkdk";
        System.out.println(checkInclusion(s1,s2));

    }
}
