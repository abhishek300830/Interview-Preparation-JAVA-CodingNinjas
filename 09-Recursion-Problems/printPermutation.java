public class printPermutation {
    static void printpermut(StringBuilder str, int idx) {
        if (idx >= str.length()) {
            System.out.println(str);
            return;
        }
        for (int i = idx; i < str.length(); i++) {
            Character temp = str.charAt(idx);
            str.setCharAt(idx, str.charAt(i));
            str.setCharAt(i, temp);
            // recursion
            printpermut(str, idx + 1);
            // back track
            Character temp1 = str.charAt(idx);
            str.setCharAt(idx, str.charAt(i));
            str.setCharAt(i, temp1);

        }
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        printpermut(s, 0);

    }
}
