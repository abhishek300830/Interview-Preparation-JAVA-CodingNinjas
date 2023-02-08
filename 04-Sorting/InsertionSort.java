
public class InsertionSort {
    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];

            }
            arr[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 56, 23, 45, 67, 89, 90, 10 };
        insertionSort(arr);
        System.out.println("Sorted Array : ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
