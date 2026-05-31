public class Loops {
    static void main() {
//        for (int i = 1; i<=5; i++){
//            System.out.println(i);
//        }
//
//            System.out.println("list of odd numbers till 10:");
//        for (int j = 1; j<=10; j+=2){
//            System.out.println(j);
//        }

        // PATTERN PRINTING
//        for (int i = 1; i<=3; i++){
//            for (int j=1; j<=3; j++){
//                System.out.print("* ");
//            }
//            System.out.println(); // next liner
//        }

        // to explicitly exit from loop use break;
//        for (int k = 1; k<=10; k++) {
//            if (k == 5) {
//                break;
//            }
//            System.out.println(k);
//        }
        // to skip specific iteration
//        for (int l = 1; l<=10; l++){
//            if (l == 5){
//                continue;
//            }
//            System.out.println(l);
//        }

        // WHILE LOOPs
        int i =1;
        while (i<=2){
            int j =1;
            while(j<=5){
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        }

        // DO-WHILE : ek baar toh run hoga hi hoga
        do {
            System.out.println(i);
            //Updation
            i++;
        }while (i <= 0); // op will be 1
    }
}