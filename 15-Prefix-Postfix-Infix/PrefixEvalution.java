import java.util.Stack;

public class PrefixEvalution {
    public static void main(String[] args) {

        // prefix Expression
        String str = "-+7*45+20";

        // stack
        Stack<Integer> stack = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                stack.push(str.charAt(i) - '0');
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (str.charAt(i)) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    case '^':
                        stack.push((int) Math.pow(operand1, operand2));
                        break;
                    default:
                        break;
                }

            }
        }

        System.out.println("final result " + stack.pop());

    }
}
