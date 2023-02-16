
public class MergeSortUsingRecursion {

    public static void MergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid + 1, end);
        merge(arr, start, end);

    }

    public static void merge(int input[], int start, int end) {
        int mid = (start + end) / 2;
        int i = start;
        int j = mid + 1;

        int ans[] = new int[end - start + 1];
        // ans idx
        int k = 0;

        while (i <= mid && j <= end) {
            if (input[i] < input[j]) {
                ans[k] = input[i];
                i++;
                k++;
            } else {
                ans[k] = input[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            ans[k] = input[i];
            i++;
            k++;

        }
        while (j <= end) {
            ans[k] = input[j];
            j++;
            k++;
        }

        for (int index = 0; index < ans.length; index++) {
            input[start + index] = ans[index];
        }

    }

    public static void main(String[] args) {

        int arr[] = { 3, 30, 29, 10, 1, 45, 56, 23 };

        MergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}