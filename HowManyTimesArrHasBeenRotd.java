// 11th Problem in Binary Search i.e., Find out How Many times Array Has been rotated

public class HowManyTimesArrHasBeenRotd {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            
           /*  if (arr[low] <= arr[high]) {  // idu illa andu previous prob work aithu Mininmum in rotated sorted array
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            } */

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}
