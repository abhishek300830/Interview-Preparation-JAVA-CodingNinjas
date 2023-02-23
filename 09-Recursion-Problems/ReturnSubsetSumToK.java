import java.util.ArrayList;

public class ReturnSubsetSumToK {
    static ArrayList<ArrayList<Integer>> subsetSumToK(int arr[], int idx, int sum, ArrayList<Integer> outputSoFar) {
        ArrayList<ArrayList<Integer>> finalOutput = new ArrayList<>();

        helper(arr, idx, sum, outputSoFar, finalOutput);
        return finalOutput;

    }

    static void helper(int arr[], int idx, int sum, ArrayList<Integer> outputSoFar,
            ArrayList<ArrayList<Integer>> FinalOutPut) {
        if (idx == arr.length) {
            int sumofSubset = 0;
            for (int x : outputSoFar) {
                sumofSubset += x;
            }
            if (sumofSubset == sum) {

                FinalOutPut.add(new ArrayList<>(outputSoFar));
            }
            return;
        }
        outputSoFar.add(arr[idx]);
        helper(arr, idx + 1, sum, outputSoFar, FinalOutPut);
        outputSoFar.remove(outputSoFar.size() - 1);
        helper(arr, idx + 1, sum, outputSoFar, FinalOutPut);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 3, 17, 1, 18, 15, 3, 17 };
        int k = 6;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result = subsetSumToK(arr, 0, k, new ArrayList<>());
        System.out.println(result);

    }
}
