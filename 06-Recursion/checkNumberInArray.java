import java.util.Scanner;

public class checkNumberInArray {
    static boolean searchInArray(int arr[], int value, int idx) {
        if (idx == arr.length) {
            return false;
        }
        if (value == arr[idx]) {
            return true;
        }
        idx++;
        return searchInArray(arr, value, idx);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value want to search : ");
        int value = sc.nextInt();
        sc.close();
        int idx = 1;
        boolean result = searchInArray(arr, value, idx);
        if (result) {
            System.out.println(value + " Found in Array");
        } else {
            System.out.println(value + " Not Found");
        }

    }
}
