// 6th problem in Binary Search i.e., First and Last Occurance of X

public class FirstAndLastOccr {
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
        int arr[] = {1, 3, 5, 7, 7, 9, 10};
        int x = 11, n = arr.length;

        int lb = lowerBound(arr, x, n);
        int ub = (upperBound(arr, n, x) - 1);

        System.out.println("first to last is "+lb+ " and "+ub);
    }

}