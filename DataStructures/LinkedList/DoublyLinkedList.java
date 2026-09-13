package LinkedList;

public class DoublyLinkedList {
    private Doubly_Node head;
    private Doubly_Node tail;
    private int length;

    public void append(Object item) {
        Doubly_Node append = new Doubly_Node(item);
        if (head == null) {
            head = append;
            tail = append;
            length = 1;
            return;
        }

        tail.next = append;
        append.previous = tail;
        tail = append;
        length++;
    }

    public void prepend(Object item){
        Doubly_Node node = new Doubly_Node(item);

        head.previous = node;
        node.next = head;
        head = node;
        length++;

    }

    public void showList(){
        Doubly_Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
