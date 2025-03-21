// This is the 3rd problem in Binary Search

public class UpperBound {
    public static int upperBound(int arr[], int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 9, 15, 19};
        int n = arr.length, x = 6;
        int soln = upperBound(arr, n, x);

        System.out.println("The upper bound of " +x+ " is "+soln);
    }
}
