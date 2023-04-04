
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
    public void enqueue(int value) throws QueueEmptyException {
        if (size == data.length) {
            throw new QueueEmptyException();
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        // condition for making it circular
        // remove below this part to make non circular Queue
        if (rear == data.length) {
            rear = 0;
        }
        // remove above this part to make non circular Queue

        data[rear] = value;
        size++;
    }

    // front
    public int front() throws QueueEmptyException {
        if (!isEmpty()) {
            return data[front];
        } else {
            throw new QueueEmptyException();
        }
    }

    // dequeue
    public int dequeue() throws QueueEmptyException {
        if (!isEmpty()) {
            int temp = data[front++];

            // remove below this part to make non circular Queue
            if (front == data.length) {
                front = 0;
            }
            // remove above this part to make non circular Queue
            size--;
            if (isEmpty()) {
                front = -1;
                rear = -1;
            }
            return temp;
        } else {
            throw new QueueEmptyException();
        }

    }

}
