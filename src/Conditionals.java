import java.util.Scanner;

public class Conditionals {
    static void main() {
        // IF
        int age = 19;
        if (age>18){
            System.out.println("your are eligible to vote");
        }
        // IF-ELSE
        int marks = 47;
        if (marks>=50){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        // IF - ELSE LADDER
        int streak = 78;
        if (streak>=90){
            System.out.println("excellent");
        } else if (streak>=75) {
            System.out.println("Good");
        } else if (streak>=50) {
            System.out.println("Average");
        } else {
            System.out.println("need more hard work");
        }

        // Nested if - else
        int ayuu = 12;
        String gender = "purush";
        if (gender.equals("purush")){
            System.out.println("aap purush hain");
            if (ayuu > 18){
                System.out.println("aur Aap bade hain");
            }
            else {
                System.out.println("Aur Aap abhi chhote hain");
            }
        }
        else {
            System.out.println("not male");
        }

        // TERNARY OPr
        int streak_days = 36;
        String status = (streak_days>=30) ? "Consistent" : "Irregular";
        System.out.println("THE PERSON IS : " + status);

        // SWITCH STATEMENT:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for day ");
        int day = sc.nextInt();

        switch(day) {
            case 1 :
                System.out.println("MONDAY");
                break;
            case 2 :
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4 :
                System.out.println("THU");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            default:
                System.out.println("Sunday");

        }
    }
}