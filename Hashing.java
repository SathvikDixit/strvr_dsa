// Learning Hashing  "THIS IS INTEGER HASHING"

import java.util.*;

class Hashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.err.print("Enter the number of elements in an array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        System.err.print("Enter the numner of queries: ");
        q = sc.nextInt();
        System.err.print("Enter the number that needs to hash: ");
        while (q-- != 0) {
            int number;
            number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}