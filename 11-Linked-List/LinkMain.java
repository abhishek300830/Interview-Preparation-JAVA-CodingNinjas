public class LinkMain {
    public static void main(String[] args) {
        LinkListImplementation ll = new LinkListImplementation();
        ll.insertIterative(10);
        ll.insertIterative(20);
        ll.insertIterative(30);
        ll.insertIterative(40);
        ll.insertIterative(50);
        ll.insertRecusive(ll.head, 110);
        ll.insertRecusive(ll.head, 120);
        ll.print();
        System.out.println("\nHeight : " + ll.height);
    }
}
