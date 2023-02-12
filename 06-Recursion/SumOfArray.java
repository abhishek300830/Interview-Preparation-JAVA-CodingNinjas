import java.util.Scanner;

public class SumOfArray {
    static int printSum(int arr[]) {
        if (arr.length <= 0) {
            return 0;
        }
        int curr = arr[0];
        int smallArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArr[i - 1] = arr[i];
        }

        return curr + printSum(smallArr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        sc.close();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // recursive Function call
        int result = printSum(arr);
        System.out.println("Sum of Array is : " + result);

    }
}
