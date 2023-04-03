
public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    // constructor
    public QueueUsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // size
    public int size() {
        return size;
    };

    // is Empty
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Enqueue
    public void enqueue(int value) {
        if (isEmpty()) {
            data[++rear] = value;
            front++;
            size++;
        } else {
            data[++rear] = value;
            size++;
        }

    }

    // front
    public int front() {
        if (!isEmpty()) {
            return data[front];
        } else {
            return -1;
        }
    }

    // dequeue
    public int dequeue() {
        if (!isEmpty()) {
            size--;
            return data[front++];

        } else {
            return -1;
        }

    }

}
