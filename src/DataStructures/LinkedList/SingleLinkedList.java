package LinkedList;

public class SingleLinkedList {
    private Sinlge_Node head;
    private Sinlge_Node tail;
    private int length;

   public void Append(Object item){
       Sinlge_Node append = new Sinlge_Node(item);
       if(head == null){
           head = append;
           tail = append;
           length = 1;
           return;
       }
       tail.next = append;
       tail = append;
       length++;
   }
   //Prepend is just to add an item in the first of the LinkedList
   public void prepend(Object item){
       //first we will make the new item in a node
       Sinlge_Node prependItem = new Sinlge_Node(item);

       //second will make the new node to reference to the head
       prependItem.next = head;
       //third will make the head equals ro the new node item
       head = prependItem;
       //fourth will increase the amount of length
       length++;
   }

   public void showList(){
       Sinlge_Node current = head;
       while (current != null){
           System.out.println(current.data);
           current = current.next;
       }
   }

   public void insert(Object item,Object position){
       //will create the new node for our item
       Sinlge_Node itemNode = new Sinlge_Node(item);

       //will loop into linked list to find the position we need to insert on it
       Sinlge_Node current = head;
       while(current != null && !current.data.equals(position)){
           current = current.next;
       }
       //check if the current equals null to exit this function
       if(current == null){
           System.out.println("Position not found");
           return;
       }
       //now we have the position and need to put the new item
       //first check if the current value is the tail one,So will need to make the new node the tail one
       if(current == tail){
           tail.next = itemNode;
           tail = itemNode;
           length++;
       }else{
          //if not will add into the position we have
           current.next = itemNode;
           itemNode.next = current.next.next;
           length++;
       }
   }
   public void remove(Object position){

       //check if the current equals null to exit this function
       if(head == null){
           System.out.println("Position not found");
           return;
       }
       if (head.data == position) {
           head = head.next;
           return;
       }
       //will loop into linked list to find the position we need to insert on it
       Sinlge_Node current = head;
       while (current.next != null) {
           if (current.next.data.equals(position)) {
               if (head.data.equals(position)) {
                   tail = current;
               }

               current.next = current.next.next;
               length--;
               return;
           }
           current = current.next;
       }

   }

   public void reverse(){
       Sinlge_Node current = head;
       Sinlge_Node prev = null;
       Sinlge_Node next;

       tail = head;

       while(current != null){

           next = current.next;

           current.next = prev;

           prev = current;

           current = next;
       }

       head = prev;
   }

}

