// Learning Hashing  "THIS IS CHARACTER HASHING"

import java.util.Scanner;
public class Hashing2 {
    public static void main(String[] args) {
        String  s;
        System.out.print("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        System.out.print("Enter the number of quaries: ");
        int q;
        q = sc.nextInt();
        System.out.print("Enter the Character the needs to be hashed: ");
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
            sc.close();
        }
    }
}