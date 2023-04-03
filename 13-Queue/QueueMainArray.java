
public class QueueMainArray {
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        System.out.println("is Empty " + q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println("is Empty " + q.isEmpty());
        System.out.println("front " + q.front());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("dequeue " + q.dequeue());
        System.out.println("front " + q.front());

    }
}
