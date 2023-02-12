import java.util.Scanner;

public class PowerOfX {
    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * calPower(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of X :");
        int x = sc.nextInt();
        System.out.print("Enter the Value of N :");
        int n = sc.nextInt();
        sc.close();
        int result = calPower(x, n);

        System.out.println(x + "^" + n + " is : " + result);

    }
}
