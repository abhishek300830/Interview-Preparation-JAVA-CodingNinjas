import java.util.Stack;

public class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(9);
        st.push(8);
        st.push(7);
        st.push(91);
        st.push(92);
        st.push(94);
        System.out.println("size " + st.size());
        System.out.println("pop " + st.pop());
        System.out.println("pop " + st.pop());
        System.out.println("pop " + st.pop());
        System.out.println("size " + st.size());
        System.out.println("Empty " + st.isEmpty());
        System.out.println("Empty " + st.empty());
        System.out.println("size " + st.size());

    }

}
