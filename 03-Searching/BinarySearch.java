import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[], int item) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            // System.out.println("mid" + mid);
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 5, 15, 25, 35, 45, 55, 65, 75, 85, 95 };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the item you want to Find : ");
        int n = sc.nextInt();
        sc.close();

        int result = binarySearch(array, n);
        if (result == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println(n + " Found at index " + result);
        }

    }
}
