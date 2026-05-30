public class Operators {
    static void main() {
        // Arithmetic operators
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // Relational operators

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);
        System.out.println(" ");

        // LOGICAL OPERATORS
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println("Logical ops");
        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedCore);

        // INC op - pre
        int a = 10;
        System.out.println("Pre incremented value of a is " + ++a);
        // INC op - post
        int a1 = 10;
        System.out.println(a1++);
        System.out.println("Post incremented value of a is " + a1);

        // DEC
        int d = 10;
        System.out.println("pre decrement value of d is" + --d); // pre
        System.out.println(d--);
        System.out.println("post decr value of d is " + d);

    }
}