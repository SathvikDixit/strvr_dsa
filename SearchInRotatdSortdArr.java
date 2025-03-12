// 8th problem in Binary Search called Search in Roatated Sorted Array

public class SearchInRotatdSortdArr {
    public static int asdf(int[] arr, int n, int target) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;

            // Left Sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // Right Sorted
            else {
                if (arr[mid] <= target && target <= arr[high])
                    high = mid - 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = arr.length, target = 11;

        int result = asdf(arr, n, target);
        System.err.println(""+result);
    }

}