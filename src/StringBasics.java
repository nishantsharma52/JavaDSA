import java.util.Scanner;

public class StringBasics {

    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i <= n - 1; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str) {
        char[] ch = str.toCharArray();
        return ch.length;
    }

    static int getVowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static String revString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        return rev;
    }

    static Boolean palindromeOfString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String srng = sc.next();
        String rev = "";
        for (int i = srng.length() - 1; i >= 0; i--) {
            char ch = srng.charAt(i);
            rev = rev + ch;
        }
        return rev.equalsIgnoreCase(srng);
    }

    public static void main(String[] args) {
        String str = "RautAnky";
        printString(str);
        System.out.println(getLengthOfString(str));
        System.out.println(getVowelsCount(str));
        System.out.println(revString(str));
        System.out.println(palindromeOfString());

        // --- String creation ---
        // String firstName = "Ankit";
        // String lastName = new String("Raut");
        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.length());
        // System.out.println(firstName.charAt(1));

        // --- String comparison ---
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the First Name");
        // String newName = sc.next();
        // System.out.println("Enter the Second Name");
        // String secondName = sc.nextLine();
        // if (newName == secondName) {
        //     System.out.println("refers to same literal in string pool");
        // } else if (newName.equals(secondName)) {
        //     System.out.println("every char is of same case");
        // } else if (newName.equalsIgnoreCase(secondName)) {
        //     System.out.println("Content of names are same");
        // }

        // --- isEmpty and isBlank ---
        // String emptyStr = "";
        // System.out.println(emptyStr.length());
        // System.out.println(emptyStr.isEmpty());
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter blank string");
        // String blankStr = sc.nextLine();
        // System.out.println(blankStr.length());
        // System.out.println(blankStr.isBlank());

        // --- trim() ---
        // String name = "  anKIt  ";
        // System.out.println(name.length());
        // name = name.trim();
        // System.out.println(name.length());
        // System.out.println(name);

        // --- toUpperCase / toLowerCase ---
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toLowerCase());

        // --- substring ---
        // String str2 = "They call me RAUT";
        // System.out.println(str2.substring(13, 17)); // RAUT

        // --- contains, startsWith, endsWith ---
        // System.out.println(str2.contains("Raut"));   // false
        // System.out.println(str2.startsWith("They")); // true
        // System.out.println(str2.endsWith("RAUT"));   // true

        // --- valueOf ---
        // int num = 5433;
        // String strr = String.valueOf(num);
        // System.out.println(num + 1);   // 5434
        // System.out.println(strr + 1);  // "54331"

        // --- toCharArray ---
        // String name = "  anKIt  ";
        // char[] crr = name.toCharArray();
        // for (char ch : crr) {
        //     System.out.println("value = " + ch);
        // }

        // --- split ---
        // String input = "I AM the danger kyler";
        // String[] srr = input.split(" ");
        // for (String sr : srr) {
        //     System.out.println("word: " + sr);
        // }

        // --- replace ---
        // String input = "I AM the danger kyler";
        // String name = input.replace('r', 'x');
        // System.out.println(name);
    }
}