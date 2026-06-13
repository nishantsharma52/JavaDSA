public class BasicMaths {

    static void printDigit(int num){
        //agr number = 0 h to main ruk jauga
        // agr mere no != 0 h to me processing kruga ...
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

    static  boolean isPrimeOrNot(int num){
        if(num==1){
            System.out.println("choose number greater than 1");
            return  false;
        }

        for(int i = 2; i*i<=num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return  true;

        }

//        for(int i=2; i<=num-1; i++){
//            if(num%i == 0){
//                return false;
//            }
//        }
//        return  true;
//    }

    static int getGCD(int a, int b){
        while(b !=0){
            int oldValueOfb = b;
            b= a%b;
            a = oldValueOfb;
        }
        int ans = a;
        return  ans;
    }

    static  int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        int pro = a*b;
        int lcm = pro/gcd;
        return lcm;
    }

    static  boolean isArmstrongNumber(int num){
        int sum = 0;
        int originalNum = num;
        while(num!=0){
            int digit = num%10;
            int cube = digit*digit*digit;
            sum = sum + cube;
            num = num/10;
        }
        if(sum == originalNum){
            System.out.println("armstrong ");
            return  true;
        }
        else{
            System.out.println("not armstrong");
            return  false;
        }
    }

    static boolean checkPerfectNumber(int num){
        int sum = 1;
        for(int i = 2; i*i<=num; i++){
            if(num%i == 0){
                int firstNum = i ;
                int secondNum = num/i;
                sum = sum + firstNum + secondNum;
            }
        }
        if(sum == num){
            return true;

        }
        else{
            return  false;
        }
    }

static  void  printAllPrimes(int n){
        for(int num =2 ;num<=n; num++ ){
            boolean isPrime = isPrimeOrNot(num);
            if(isPrime == true){
                System.out.println(num);
            }
        }
}


    static void main() {
//        System.out.println(getGCD(18,12));
//        System.out.println(getLCM(18,12));
//        System.out.println(isArmstrongNumber(153));
//        System.out.println(checkPerfectNumber(6));
        printAllPrimes(20);


//        int num = 10;
//        boolean ans = isPrimeOrNot(num);
//        System.out.println(ans);
//

//        int num = 12231;
//        boolean ans =isPalindrome(num);
//        System.out.println(ans);

//        int num = 5612378;
//        int ans =reverseOfNumber(num);
//        System.out.println(ans);


    }
}
