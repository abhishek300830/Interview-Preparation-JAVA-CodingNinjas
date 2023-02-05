import java.util.Scanner;

public class LinearSearch {

    public static int search(int arr[], int item) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                idx = i;
                return idx;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        // Declared and Array
        int array[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

        // Linear Search

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value you want to search : ");
        int n = sc.nextInt();
        sc.close();

        int result = search(array, n);
        if (result == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println(n + " Found at Index : " + result);
        }

    }
}
