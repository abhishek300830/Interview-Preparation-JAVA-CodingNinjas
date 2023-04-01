public class StackMainLL {
    public static void main(String[] args) {
        StackUsingLL<Integer> stack = new StackUsingLL<>();

        System.out.println("stack.isEmpty " + stack.isEmpty());
        System.out.println("get size " + stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack.isEmpty " + stack.isEmpty());
        System.out.println("get size " + stack.size());
        System.out.println("Top " + stack.top());
        System.out.println("pop " + stack.pop());

        System.out.println("get size " + stack.size());
        System.out.println("pop " + stack.pop());

    }
}
