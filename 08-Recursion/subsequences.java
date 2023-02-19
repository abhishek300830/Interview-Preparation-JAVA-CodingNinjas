public class subsequences {
    public static String[] findSubseq(String str) {

        if (str.length() == 0) {
            String s[] = { "" };
            return s;
        }

        String smallArray[] = findSubseq(str.substring(1));
        String ans[] = new String[smallArray.length * 2];

        int k = 0;

        for (int i = 0; i < smallArray.length; i++) {
            ans[k] = smallArray[i];
            k++;
        }
        for (int i = 0; i < smallArray.length; i++) {
            ans[k] = str.charAt(0) + smallArray[i];
            k++;
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "xyz";
        String[] result = findSubseq(s);
        for (String string : result) {
            System.out.print("' " + string + " '" + " ");
        }

    }
}