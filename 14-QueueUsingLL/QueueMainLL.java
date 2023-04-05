public class QueueMainLL {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("size " + queue.size());
        System.out.println("dequeue " + queue.dequeue());
        System.out.println("dequeue " + queue.dequeue());
    }
}