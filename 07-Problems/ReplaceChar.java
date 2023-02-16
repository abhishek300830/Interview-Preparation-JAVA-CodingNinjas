public class ReplaceChar {

    static String replace(String str, String ch) {
        if (str == "") {
            return "";
        }
        String s = "";
        if (str.charAt(0) == 'a') {
            s += ch;
        } else {
            s += str.charAt(0);
        }

        return s + replace(str.substring(1), ch);

    }

    public static void main(String[] args) {
        String str = "abacd";
        String ch = "x";

        String result = replace(str, ch);
        System.out.println(result);

    }
}
