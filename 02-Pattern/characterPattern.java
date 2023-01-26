/*
    ABCDE
    ABCDE
    ABCDE
    ABCDE
    ABCDE
 */

import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
