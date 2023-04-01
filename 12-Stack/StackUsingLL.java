public class StackUsingLL<T> {

    private LinkedNode<T> head;
    // private LinkedNode<T> tail;
    private int size = 0;

    // isEmpty
    public boolean isEmpty() {
        return size == 0;

    }

    // size
    public int size() {
        return size;
    }

    // push
    public void push(T val) {
        LinkedNode<T> temp = new LinkedNode<T>(val);
        if (isEmpty()) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // top
    public T top() {
        return head.data;

    }

    // pop
    public T pop() {
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

}
