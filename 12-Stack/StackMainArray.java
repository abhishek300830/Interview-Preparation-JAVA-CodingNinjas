
public class StackMainArray {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        System.out.println("stack.isEmpty " + stack.isEmpty());
        System.out.println("get size " + stack.getSize());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("stack.isEmpty " + stack.isEmpty());
        System.out.println("get size " + stack.getSize());
        System.out.println("Top " + stack.top());
        System.out.println("pop " + stack.pop());

        System.out.println("get size " + stack.getSize());
        System.out.println("pop " + stack.pop());

    }
}
