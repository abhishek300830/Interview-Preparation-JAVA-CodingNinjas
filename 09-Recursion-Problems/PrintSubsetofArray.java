import java.util.ArrayList;

public class PrintSubsetofArray {
    public static void printSubset(int[] arr, int idx, ArrayList<Integer> outputsoFar) {
        if (idx == arr.length) {
            System.out.println(outputsoFar);
            return;
        }
        outputsoFar.add(arr[idx]);
        printSubset(arr, idx + 1, outputsoFar);
        outputsoFar.remove(outputsoFar.size() - 1);
        printSubset(arr, idx + 1, outputsoFar);
    }

    public static void main(String[] args) {

        int arr[] = { 15, 20, 12 };

        printSubset(arr, 0, new ArrayList<>());

    }
}
