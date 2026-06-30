package ArraysProblems;

import java.util.HashMap;

public class lac_28 {
//     problem 1   reverse an array....
//    static  void reverseArray(int [] arr){
//        int n =  arr.length;
//        int i = 0;
//
//        int j = n -1;
//        while (i<=j){
//            //swap
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
////            i ko aage bhadao
//            i++;
////            j ko aage badao
//            j--;
//        }
//        for(int k : arr){
//            System.out.println(k);
//        }
//
        //problem 2 shift by 1

//        static void shiftBy1(int[] arr){
//            int n = arr.length;
//            int temp = arr[n-1];
//            for(int i = n-1; i>0; i--){
//                arr[i] = arr[i-1];
//        }
//            arr[0] = temp;

//    }



// problem 3 printAlternate;
//static  void printAlternaate(int[] arr){
//    int n = arr.length;
//    int i = 0;
//    int j= n-1;
//    while(i<=j){
//        if(i==j){
//            System.out.println(arr[i]);
//            return;
//        }
//        else{
//            System.out.println(arr[i]);
//            i++;
//            System.out.println(arr[j]);
//            j--;
//        }
//    }
//}

//problem: 4  get mode  mtlb kon sa element sbse jyada bar aaya print kro

static int getMode(int[] arr){
    HashMap<Integer,Integer> freq = new HashMap<>();
    for(int num: arr){
        freq.put(num,freq.getOrDefault(num,0) + 1);
    }

    for(int i: freq.keySet()){
//        i will  represent key
        System.out.println(i +" -> " + freq.get(i));
    }

    int maxFreq = -1;
    int maxFreqWaliKey = -1;

    for(int key: freq.keySet()){
        int currentKey = key;
        int currentKeyKiFreq = freq.get(key);
        if(currentKeyKiFreq> maxFreq){
            //muje new max mil gya
            maxFreq= currentKeyKiFreq;
            maxFreqWaliKey = currentKey;
        }
    }
    return  maxFreqWaliKey;
}




    static void main() {
        int [] arr = {1,2,3,4,4,4,4,5,4,5,5,5,5,5,5};
        int ans = getMode(arr);
        System.out.println( "sbse jyada frequency " + ans + " ki h");
////        shiftBy1(arr);
//        printAlternaate(arr);

//        for(int a: arr){
//            System.out.print(a + " ");
//        }
//        reverseArray(arr);
    }
}
