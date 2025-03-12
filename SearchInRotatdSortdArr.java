// 8th problem in Binary Search called Search in Roatated Sorted Array

public class SearchInRotatdSortdArr {
    public static int asdf(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;

            // Left Sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid])
        }
    }
}
