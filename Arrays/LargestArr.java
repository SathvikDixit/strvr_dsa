
public class LargestArr {
    static int findLargestInArray (int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 2, 7, 9};
        System.out.println("Largest number in array is: " + findLargestInArray(array));
    }
}





























