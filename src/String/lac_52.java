package String;

public class lac_52 {
    static String removeOccurences(String s, String part){
        // kab tak same 2 steps krenge
        // jav takk part exist krte h s string me
        while (s.contains(part)){
            // search part inside s
            int index = s.indexOf(part);
            // create a new string by merging the left
            // and right part of dound substring inside s string
            s = s.substring(0,index) + s.substring((index+part.length()));
        }
        return  s;
    }
    static void main(String[] args) {
        String s = "pqxpqypqz";
        String part = "pq";
        System.out.println(removeOccurences(s,part));

    }
}
