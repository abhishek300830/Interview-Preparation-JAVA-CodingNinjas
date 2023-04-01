public class LinkListImplementation {
    LinkNode head;
    int height = 0;

    LinkListImplementation() {
        head = null;
    }

    // Insert in linked List
    public void insertIterative(int value) {
        LinkNode newNode = new LinkNode(value);
        // ll is empty
        if (head == null) {
            head = newNode;
        } else {
            // insert at start
            newNode.next = head;
            head = newNode;
        }
        height++;
    }

    // Recursive Approach to insert
    public void insertRecusive(LinkNode head, int value) {

        // insert at end
        if (head.next == null) {
            LinkNode newNode = new LinkNode(value);
            head.next = newNode;
            height++;
            return;
        }
        insertRecusive(head.next, value);

    }

    // print linkedList
    public void print() {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}
