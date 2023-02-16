import java.util.Scanner;

// not completed
public class TripletSum {
    static int calculateSum(int arr[], int value) {
        int counter = 0;
        for (int i = 0; i < arr.length - 3; i++) {
            // int a = i + 1;
            // int b = i + 2;
            for (int j = i + 1; j < arr.length - 2; j++) {
                for (int k = j + 1; k < arr.length - 1; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == value) {
                        counter++;
                    }
                }
            }
        }
        return counter;
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
            System.out.print("Enter Triplet Sum Value : ");
            int value = sc.nextInt();

            int result = calculateSum(arr, value);

            System.out.println("result : " + result);
        }
        sc.close();
    }
}
