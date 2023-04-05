
public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    // size
    public int size() {
        return size;
    }

    // isEmpty
    public boolean isEmpty() {
        return size <= 0;
    }

    // enqueue
    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }

    // front
    public T front() throws QueueEmptyException {
        if (!isEmpty()) {

            return front.data;
        } else {
            throw new QueueEmptyException();
        }

    }

    // dequeue
    public T dequeue() throws QueueEmptyException {
        if (!isEmpty()) {
            T temp = front.data;
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
                size = 0;
            }

            return temp;
        } else {
            throw new QueueEmptyException();
        }

    }

}
