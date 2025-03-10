// This is the 2nd problem in binary search

public class LowerBound {
    public static int lowerBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 8, 15, 19};
        int x = 9;
        int n = 5;
        int soln = lowerBound(arr, x,n);

        System.err.println("The Lower Bound of " +x+ " is index "+soln);
    }
}