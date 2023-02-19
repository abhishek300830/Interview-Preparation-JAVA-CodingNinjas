// Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
// a. The string begins with an 'a'
// b. Each 'a' is followed by nothing or an 'a' or "bb"
// c. Each "bb" is followed by nothing or an 'a'

public class CheckAB {
    public static boolean check(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.charAt(0) == 'a') {
            return check(s.substring(1));

        }
        if (s.substring(0, 2).equals("bb")) {
            // neglecting bbb condition
            if (s.substring(0).equals("bbb")) {
                return false;
            }

            return check(s.substring(2));
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String s = "abbabbabbaabbabbaabbb";
        boolean result = check(s);
        System.out.println(result);
    }
}
