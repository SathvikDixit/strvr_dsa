// Strivers 1st Binary Search Problem 

public class BinarySearch1 {
    public static int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (target > arr[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    
}
