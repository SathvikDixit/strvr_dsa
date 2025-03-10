// This is the 4th problem in Binary Search
                            //  It is same as Lower Bound
public class SearchInsertPosition {
    
    public static int searchInsertPosition(int[] arr, int x, int n) {
        int low = 0, high = n-1;
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
        int arr[] = {1, 3, 5, 6};
        int n = arr.length, x = 2;
        int soln = searchInsertPosition(arr,x,n);

        System.err.println("The ans is " +soln);
    }
}
