public class Pattern_printing {


    static void main() {

        // pattern 1
//        int n = 4;
//        for (int i=1; i<=n; i++){
//            for ( int j=1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        // pattern 2
//        int n = 3;
//        int m = 5;
//        for (int i=1; i<=n; i++){
//            for ( int j=1; j<=m; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



//        pattern 3
//        int n=5;
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // pattern 4
//        int n = 5 ;
//        for(int i = 1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for(int j= 1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        //pattern 5
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern 6

//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j<=2*i-1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//        pattern 7

//        int n= 4;
//        for(int i= 1; i<=n; i++){
//            for(int j=1; j<=i-1; j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=2*n-2*i+1; j++){
//                //2n-i-space
//                //2n-i-[row-1]
//                //2n-2i+1
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //pattern 8

//        int n=4;
//        for(int i = 1; i<=n; i++){
//            for(int j=1 ; j<=6; j++){
//                if(i==1 || i==n){
//                    System.out.print("* ");
//                }
//                else{
//                    if(j==1) {
//                        System.out.print("* ");
//                    }
//                    else if(j==6) {
//                        System.out.print("* ");
//                    }
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

        //pattern 9

//        int n = 15;
//        for(int i = 1; i<=n; i++){
//            if(i==1 || i==2 || i==n){
//                for(int j=1; j<=i; j++){
//                    System.out.print("* ");
//                }
//
//            }
//            else{
//                System.out.print("* ");
//                for (int j = 1; j<=i-2; j++){
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //pattern 10
//        int n = 5;
//        for(int i=1; i<=n; i++){
//        for (int j=1; j<=n-i; j++) {
//            System.out.print("  ");
//        }
//
//        if(i==1 || i==n) {
//            for (int j=1; j<=2*i-1; j++) {
//                System.out.print("* ");
//            }
//        } else {
//            System.out.print("* ");
//            for(int j=1; j<=2*i-3; j++) {
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//        }
//
//        System.out.println();
//    }
//

        //pattern 11
        //part1

//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j<=2*i-1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//         //part2
//
//        for(int i= 1; i<=n; i++){
//            if(i==1){
//                continue;
//            }
//            for(int j=1; j<=i-1; j++){
//
//                System.out.print("  ");
//            }
//            for(int j=1; j<=2*n-2*i+1; j++){
//                //2n-i-space
//                //2n-i-[row-1]
//                //2n-2i+1
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern 12
        //part 1
//        int n = 4;
//        for(int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++) {
//                System.out.print("  ");
//            }
//
//            if(i==1 ) {
//                for (int j=1; j<=2*i-1; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for(int j=1; j<=2*i-3; j++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        //part 2
//        for(int i=1; i<=(n-1); i++ ){
//            for(int j = 1; j<=i; j++){
//                System.out.print("  ");
//            }
//            if(i==n-1){
//                System.out.print("* ");
//            }
//            else{
//                System.out.print("* ");
//                for(int j = 1; j<=2*(n-i) -3 ; j++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }

        // pattern 13

//        int n = 4;
//        for (int i = 1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(int j=1; j<=(2*n) - (2*i); j++){
//                System.out.print("  ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//        for (int i = 1; i<=n; i++){
//            for (int j= 1; j<=n-i+1; j++) {
//                System.out.print("* ");
//            }
//            for(int j=1; j<=(2*i)-2; j++){
//                System.out.print("  ");
//            }
//            for (int j= 1; j<=n-i+1; j++) {
//                System.out.print("* ");
//            }
//        System.out.println();
//    }
//
//


        // pattern 14
//
//        int n=5;
//        for(int i = 1; i<=n; i++){
//            for(int j= 1; j<=i; j++){
//                System.out.print(j+" " );
//            }
//            System.out.println();
//        }


        //pattern 15

//        int n=5;
//        int count = 1;
//        for(int i = 1; i<=n; i++){
//            for(int j= 1; j<=i; j++){
//               System.out.print(count +" ");
//               count++;
//           }
//          System.out.println();
//       }



        //pattern 16
//
//        int n=5;
//        for(int i = 1; i<=n; i++){
//            for(int j= 1; j<=i; j++){
//              int a = j;
//              int b = ('A' - 1);
//              int ans = a + b;
//              char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//
//            }
//            System.out.println();
//        }

        //pattern 17

//        int n=5;
//        for(int i = 1; i<=n; i++){
//            for(int j= 1; j<=i; j++){
//                int a = n-j;
//                int b = 'A';
//                int ans = a + b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }

        // pattern 18 home work









        //pattern 19
//
//        int n = 4;
//        for(int i = 1; i<=n; i++){
//            for(int j =1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j =1; j<=i; j++){
//                System.out.print(j+ " ");
//            }
//            int rowvalue = i;
//            int decRowValue = i-1;
//            for(int j=1; j<=i-1; j++){
//                System.out.print(decRowValue+ " ");
//                decRowValue--;
//            }
//            System.out.println();
//        }



        //pattern 20

//        int n = 4;
//       for(int i = 1; i<=n; i++) {
//           for (int j = 1; j <= n - i; j++) {
//               System.out.print("  ");
//           }
//           for(int j= 1; j<=2*i-1; j++){
//               System.out.print(i + " ");
//           }
//
//           System.out.println();
//       }
//

        //pattern 21
//
//        int n = 4;
//        for(int i = 1; i<=n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for(int j= 1; j<=i; j++){
//                int a = j;
//                int b = ('A' - 1);
//                int ans = a + b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            char toPrint = (char)(i + 'A' - 2);
//            for(int j= 1; j<=i-1; j++){
//                System.out.print(toPrint +" ");
//                toPrint--;
//            }
//
//            System.out.println();
//        }





    }
}
