
public class BinarySearchRecusive {

    public static int search(int arr[], int value, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] < value) {
            start = mid + 1;
            return search(arr, value, start, end);

        } else {
            start = 0;
            end = mid - 1;
            return search(arr, value, start, end);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8 };
        int value = 6;
        int result = search(arr, value, 0, arr.length - 1);
        System.out.println(result);

    }
}
