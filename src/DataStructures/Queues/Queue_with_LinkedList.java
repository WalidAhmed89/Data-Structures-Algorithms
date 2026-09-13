package Queues;

public class Queue_with_LinkedList {
    //Variables for the Queue Structure
    Queue_Node first;
    Queue_Node last;
    int length;

    //Peek is method for return the first item in Queue
    public Object peek() {
        //first check if the Queue is empty
        if (this.length == 0) {
            return null;
        } else {
            //Here we return the last element because in queue is FIFO(First In First Out)
            return this.first.data;
        }
    }

    //Enqueue is method to add new element into queue
    public void enqueue(Object value) {
        //make new node for make the queue linked
        Queue_Node node = new Queue_Node(value);
        //check if the queue is empty And if is,Will add this element to the first and last queue
        if (this.length == 0) {
            this.first = this.last = node;
            length++;
            return;
        } else {
            //make the new node reference with the first element and make it first
            last.next = node;
            last = node;
            length++;
        }
    }

    //Dequeue is method to delete the last element
    public Object Dequeue() {
        //check if the queue is empty
        if (length == 0) {
            return null;
        }
        //stores the last data into variable
        Object value = first.data;

        first = first.next;
        length--;

        //if the deletion is the only element in the queue we need to make the first empty
        if(length == 0){
            last = null;
        }
        return value;
    }
}
