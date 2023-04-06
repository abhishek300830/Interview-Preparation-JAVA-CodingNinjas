import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {

        // postfix Expression
        String str = "46+2/5*7+";

        // stack
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                stack.push(str.charAt(i) - '0');
            } else {
                // Notice that in case of prefix operand 2 is down
                // for more reference -> AC 23.6
                int operand2 = stack.pop();
                int operand1 = stack.pop();

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
