// 12th Problem in Binary Search i.e., Single Element in Sorted Array

public class SingleEleInArr {
    public static int findSingleEle (int[] arr, int n) {
        int low = 1, high = n - 2;

        if (n == 1) return arr[0];

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            if (mid % 2 == 1 && arr[mid] == arr[mid - 1] || mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

   public static void main(String[] args) {
    int arr[] = {1,1,2};
    int n = arr.length;
    int ans = findSingleEle(arr, n);
    System.out.println("The Single Element in the array is "+ ans);
   }

}
