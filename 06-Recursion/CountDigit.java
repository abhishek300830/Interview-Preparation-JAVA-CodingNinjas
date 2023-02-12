import java.util.Scanner;

public class CountDigit {
    static int count(int n) {
        if (n <= 0) {
            return 0;
        }
        n = n / 10;
        return 1 + count(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit : ");
        int n = sc.nextInt();
        sc.close();
        int result = count(n);
        System.out.println("Number of Digits is : " + result);
    }
}
