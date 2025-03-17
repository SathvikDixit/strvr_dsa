// 12th Problem in Binary Search i.e., Single Element in Sorted Array

public class SingleEleInArr {
    public static int findSingleEle (int[] arr, int n) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] != arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return arr[left];
    }

   public static void main(String[] args) {
    int arr[] = {1,1,2};
    int n = arr.length;
    int ans = findSingleEle(arr, n);
    System.out.println("The Single Element in the array is "+ ans);
   }
}










