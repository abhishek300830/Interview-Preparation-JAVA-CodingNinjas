public class SplitArray {
    public static boolean helper(int arr[], int n, int start, int lsum, int rsum) {

        // base case
        if (start == n) {
            return lsum == rsum;
        }
        // condition divide by 5 in left group
        if (arr[start] % 5 == 0) {
            lsum += arr[start];
            // if divide by 3 not by 5 in right group
        } else if (arr[start] % 3 == 0) {
            rsum += arr[start];
        } else {
            // Try adding in both the sub-arrays (one by one)
            // and check whether the condition satisfies
            return helper(arr, n, start + 1, lsum + arr[start], rsum)
                    || helper(arr, n, start + 1, lsum, rsum + arr[start]);
        }
        // For cases when element is multiple of 3 or 5.
        return helper(arr, n, start + 1, lsum, rsum);

    }

    public static boolean splitArray(int arr[], int n) {
        return helper(arr, n, 0, 0, 0);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3 };
        // int arr[] = { 1, 2 };
        boolean result = splitArray(arr, arr.length);
        System.out.println("Result : " + result);

    }
}
