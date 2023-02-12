import java.util.Scanner;

public class FirstIndex {
    static int searchInArray(int arr[], int value, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        if (value == arr[idx]) {
            return idx;
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
        int idx = 0;
        int result = searchInArray(arr, value, idx);

        System.out.println("found at index: " + result);

    }
}
