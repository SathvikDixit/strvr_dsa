// 9th program in Binary Search i.e., Search Element in Rotated Sorted Array II

public class SearchInRotatdSortArrII {
    public static boolean  asdf(int[] arr, int n, int target) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            // Left Sorted portion
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;  
                } else {
                    low = mid + 1;  
                }
            }
            // Right Sorted portion
            else {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;  
                } else {
                    high = mid - 1;  
                }
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 1, 2, 2, 3, 3, 4, 5, 6};
        int n = arr.length, target = 2;

        boolean result = asdf(arr, n, target);
        if (result == false) 
            System.out.println("Target is not found");
        else
            System.err.println("Target is present in the array");
    }
}
