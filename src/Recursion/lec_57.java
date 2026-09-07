package Recursion;
public class lec_57 {
    // Print My Name n times
    static void printMyName(int n){
        // base case
        if(n==0){
            return;
        }
        // processing part
        System.out.println("Nishant");
        // Recursive all
        printMyName(n-1);
    }

    // print 1 to n number
    static void print1ToN(int n , int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        print1ToN(n,count+1);
    }

    // print N to 1
    static void printNTo1(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    }

    // print array using recursion
    static void printArray(int[] arr, int i){
        if(i>=arr.length){
            return;
        }
        System.out.println((arr[i]));
        printArray(arr,i+1);
    }

    // max element using recursion
    static int max(int[] arr,int i, int maxi){
        if(i>=arr.length){
            return maxi;
        }
        if(arr[i]>maxi){
            maxi = arr[i];
        }
       return max(arr, i+1,maxi);

    }

    // min element using recursion
    static int min(int[] arr,int i, int mini){
        if(i>=arr.length){
            return mini;
        }
        if(arr[i]<mini){
            mini = arr[i];
        }
        return min(arr, i+1,mini);

    }

    // Search element in  array using recursion
    static int findTarget(int[] arr, int i , int target){
        if(i>=arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        int ans = findTarget(arr,i+1,target);
        return  ans;
    }

    // Count element in array using recursion
    static int countTarget(int[] arr, int i, int target, int count){
        if(i>=arr.length){
            return count;
        }
        if(arr[i] == target){
            count++;
        }
        int ans = countTarget(arr,i+1,target,count);
        return ans;
    }
    // print digit of a number
    static void printDigit(int n){
        if(n==0){
            return;
        }
        int digit = n%10;

        n= n/10;
        printDigit(n);
        System.out.println(digit);
    }


    static void main(String[] args) {
//        printMyName(5);
//        print1ToN(5,1);
//        printNTo1(5);
//        int mini = Integer.MAX_VALUE;
//        System.out.println(min(arr,i,mini));
//        printArray(arr,i);
//        int[] arr = {1,2,3,1,4,5,1,7,1};
//        int i =0;
//        int target = 1;
//        int count = 0;
//        int ans = countTarget(arr,i,target,count);
//        System.out.println(ans);
        printDigit(123);
    }
}
