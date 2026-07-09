package sorting;

public class lac_35 {
    // bubble sorting

    static  void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<(n-i-1); j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static  void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];
            //shifting
            while(prev>=0 && currValue <arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // ab hmare pass khali jgh aa chuki h
            // place the value
            arr[prev+1] = currValue;
        }
    }
    static void main() {
        int[] arr = {5,7,2,6,3,1};
       insertionSort(arr);
        for(int value: arr){
            System.out.print(value +"  ");
        }

    }
}
