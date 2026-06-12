public class BasicMaths {

    static void printDigit(int num){
        //agr number = 0 h to main ruk jauga
        // agr mere no != 0 h to me processing kruga
        while(num!=0){
           int digit = num%10;
            System.out.println(digit);
            num = num/10;
        }

    }

    static int countDigit(int num){
        int count = 0;
        while(num!=0){
            int digit = num%10;
            count++;
            num= num/10;
        }
        return count;
    }
    static int sumOfDigit(int num){
        int sum = 0;
        while(num!=0){
            int digit = num%10;
           sum = sum + digit;
            num= num/10;
        }
        return sum;
    }

    static int reverseOfNumber(int num){
        int revNum = 0;
        while(num!=0){
            int digit = num%10;
           revNum = revNum*10 + digit;
            num= num/10;
        }
        return revNum;
    }


    static boolean isPalindrome(int num){
        int originalNumber = num;
        int reverseNumber = reverseOfNumber(num);
        if(originalNumber==reverseNumber){

            System.out.println("palindrome number");
            return  true;

        }
        else {
            System.out.println("not a palindrome number");
            return false;
        }

    }



    static void main() {

        int num = 12231;
        boolean ans =isPalindrome(num);
        System.out.println(ans);

//        int num = 5612378;
//        int ans =reverseOfNumber(num);
//        System.out.println(ans);


    }
}
