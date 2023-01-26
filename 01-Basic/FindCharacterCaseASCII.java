import java.util.Scanner;

public class FindCharacterCaseASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character  : ");
        char a = sc.nextLine().charAt(0);
        sc.close();
        if (a >= 65 && a <= 90) {
            System.out.println("1");
        } else if (a >= 97 && a <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

    }
}
