public class QuickSortUsingRecursion {
    public static void QuickSort(int arr[], int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        int pviotPosition = partition(arr, start, end);
        QuickSort(arr, start, pviotPosition - 1);
        QuickSort(arr, pviotPosition + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int pviot = arr[start];
        int counter = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < pviot) {
                counter++;
            }
        }
        int pviotpos = start + counter;
        int temp = arr[pviotpos];
        arr[pviotpos] = pviot;
        arr[start] = temp;

        // traverse from start and last using var
        int a = start;
        int b = end;
        while (a < pviotpos && b > pviotpos) {
            if (arr[a] > pviot && arr[b] < pviot) {
                int temp1 = arr[a];
                arr[a] = arr[b];
                arr[b] = temp1;
                a++;
                b--;

            }
            if (arr[a] < pviot) {
                a++;
            }
            if (arr[b] > pviot) {
                b--;
            }

        }
        return pviotpos;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 30, 29, 10, 1, 45, 56, 23 };

        QuickSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
