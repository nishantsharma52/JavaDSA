package Binary_Search;

public class lac_50 {

    static int unboundedSearch(int[] arr, int target) {

        // First element check
        if (arr[0] == target) {
            return 0;
        }

        // Find the range
        int i = 1;

        while (i < arr.length && arr[i] < target) {
            i = i * 2;
        }

        int s = i / 2;
        int e = Math.min(i, arr.length - 1);

        // Binary Search
        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8, 10, 15, 20, 25, 30, 35, 40, 50,60};

        System.out.println(unboundedSearch(arr, 15)); // Output: 8
    }
}