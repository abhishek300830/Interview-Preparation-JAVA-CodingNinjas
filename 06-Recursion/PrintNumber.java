import java.util.Scanner;

public class PrintNumber {
    static void printNum(int n) {
        if (n == 0) {
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();
        sc.close();
        printNum(n);
    }
}
