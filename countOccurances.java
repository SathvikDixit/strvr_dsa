// 7th program in BInary Search i.e., Count Occurrences in Sorted Array

public class countOccurances {
    public static int firstOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == x) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int x) {
        int first = firstOccurrence(arr, n, x);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, x);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 15;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}
