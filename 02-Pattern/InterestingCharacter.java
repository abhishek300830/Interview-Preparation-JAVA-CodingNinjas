
/*
    Enter the Number : 8
    H
    GH
    FGH
    EFGH
    DEFGH
    CDEFGH
    BCDEFGH
    ABCDEFGH
 */
import java.util.Scanner;

public class InterestingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) ('A' + j - 1));
            }
            System.out.println();
        }
    }
}
