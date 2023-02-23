import java.util.ArrayList;

public class PrintSubsetSumToK {
    static void subsetSumToK(int arr[], int idx, int sum, ArrayList<Integer> outputSoFar) {
        if (idx == arr.length) {
            int sumofSubset = 0;
            for (int x : outputSoFar) {
                sumofSubset += x;
            }
            if (sumofSubset == sum) {

                System.out.println(outputSoFar);
            }
            return;
        }
        outputSoFar.add(arr[idx]);
        subsetSumToK(arr, idx + 1, sum, outputSoFar);
        outputSoFar.remove(outputSoFar.size() - 1);
        subsetSumToK(arr, idx + 1, sum, outputSoFar);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 3, 17, 1, 18, 15, 3, 17 };
        int k = 6;
        subsetSumToK(arr, 0, k, new ArrayList<>());

    }
}
