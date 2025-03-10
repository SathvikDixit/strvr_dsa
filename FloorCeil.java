// This is 5th problem in Binary Search
public class FloorCeil {

    public static int bande(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int rcc (int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8};
        int n = arr.length, x = 5;
        
        int flr = bande(arr,x,n);
        int cel = rcc(arr,x,n);

        System.out.println("Floor and Ceil for " +x+ " is given below");
        System.out.print("Floor is "+flr);
        System.out.print(" and Ceil is "+cel);
    }
}
