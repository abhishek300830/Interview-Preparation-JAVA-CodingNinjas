import java.util.Stack;

// conversion Infix to Postfix 
public class InfixToPostfix {

    // precedence function
    public static int precedene(char value) {
        switch (value) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }

    // infix to postfix function\
    public static String InfixToPostfixConverter(String str) {

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            // adding a-z characters to result
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                result += str.charAt(i);
            }
            // handleing open bracket
            else if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                // removing ( bracket from stack
                if (!stack.isEmpty()) {

                    stack.pop();
                }
            }
            // handling operator case
            else {
                while (!stack.isEmpty() && (precedene(str.charAt(i)) < precedene(stack.peek()))) {
                    result += stack.pop();
                }
                // pushing current operator to stack
                stack.push(str.charAt(i));

            }
        }
        // loop ends
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;

    }

    // main code
    public static void main(String[] args) {
        String s = "(a-b/c)*(a/k-l)";

        String result = InfixToPostfixConverter(s);

        System.out.println("Postfix : " + result);

    }

}
