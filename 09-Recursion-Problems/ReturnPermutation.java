import java.util.ArrayList;

public class ReturnPermutation {
    public static ArrayList<String> permutation(String str) {

        ArrayList<String> ans = new ArrayList<>();
        helper(str, 0, ans);
        return ans;
    }

    static void helper(String str, int idx, ArrayList<String> ans) {
        if (idx == str.length()) {
            ans.add(str);
            return;
        }
        for (int i = idx; i < str.length(); i++) {
            StringBuilder s = new StringBuilder(str);
            Character ch = s.charAt(idx);
            s.setCharAt(idx, s.charAt(i));
            s.setCharAt(i, ch);
            str = s.toString();
            // find all combinations
            helper(str, idx + 1, ans);
            StringBuilder s1 = new StringBuilder(str);
            Character ch1 = s1.charAt(idx);
            s.setCharAt(idx, s1.charAt(i));
            s.setCharAt(i, ch1);
            str = s1.toString();
        }

    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> result = new ArrayList<>();
        result = permutation(s);
        System.out.println(result);

    }
}
