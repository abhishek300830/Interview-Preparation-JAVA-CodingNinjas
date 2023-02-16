import java.util.Scanner;

public class RotateArray {
    static void RotateLeft(int arr[], int value) {
        for (int i = 0; i < value; i++) {
            int temp = arr[0];
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Test Cases : ");
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            System.out.print("Enter Size of Array : ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter Elements of Array : ");
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.print("Enter value How many Left Rotation you Want : ");
            int value = sc.nextInt();

            RotateLeft(arr, value);

            for (int x : arr) {
                System.out.print(x + " ");
            }

        }
        sc.close();
    }
}
