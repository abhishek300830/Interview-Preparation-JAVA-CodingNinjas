import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character  : ");
        char a = sc.nextLine().charAt(0);
        sc.close();

        if (Character.isUpperCase(a)) {
            System.out.println("1");
        } else if (Character.isLowerCase(a)) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
