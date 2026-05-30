import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first number:");
//        int firstNum = sc.nextInt();
//        System.out.println("Enter the second number:");
//        int secondNum = sc.nextInt();
//        int sum = firstNum + secondNum;
//        System.out.println(sum);

        System.out.println("Enter the Big integer:");
        BigInteger bint = sc.nextBigInteger();

        System.out.println("Enter the short value :");
        short st = sc.nextShort();

        System.out.println("Enter the long value :");
        long lg = sc.nextLong();

        System.out.println("Enter the  float val:");
        float fl = sc.nextFloat();

        System.out.println(bint);
        System.out.println(st);
        System.out.println(lg);
        System.out.println(fl);

        sc.close();

    }
}