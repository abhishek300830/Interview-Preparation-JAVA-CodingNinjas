import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static List<List<Integer>> subsets(int arr[]) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        recursionCall(arr, 0, curr, ans);
        return ans;

    }

    public static void recursionCall(int[] arr, int idx, List<Integer> curr, List<List<Integer>> ans) {
        if (idx == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[idx]);
        recursionCall(arr, idx + 1, curr, ans);
        curr.remove(curr.size() - 1);
        recursionCall(arr, idx + 1, curr, ans);

    }

    public static void main(String[] args) {
        int arr[] = { 15, 20, 12 };
        List<List<Integer>> print = subsets(arr);
        System.out.println(print);

    }
}
