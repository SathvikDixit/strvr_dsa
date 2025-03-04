
import javax.sound.midi.SysexMessage;

// Selection Sort
public class SelectionSort {
    public static void main (String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        System.err.println("Before sorting: ");
        for (int num : nums) {
            System.err.print(num+" ");
        }





        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }
}