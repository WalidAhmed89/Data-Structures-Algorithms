package DataStructures.LinkedList;

public class SingleLinkedList {
    private Single_Node head;
    private Single_Node tail;
    private int length;

   public void Append(Object item){
       Single_Node append = new Single_Node(item);
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
       Single_Node prependItem = new Single_Node(item);

       //second will make the new node to reference to the head
       prependItem.next = head;
       //third will make the head equals ro the new node item
       head = prependItem;
       //fourth will increase the amount of length
       length++;
   }

   public void showList(){
       Single_Node current = head;
       while (current != null){
           System.out.println(current.data);
           current = current.next;
       }
   }

   public void insert(Object item,Object position){
       //will create the new node for our item
       Single_Node itemNode = new Single_Node(item);

       //will loop into linked list to find the position we need to insert on it
       Single_Node current = head;
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
       Single_Node current = head;
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
       Single_Node current = head;
       Single_Node prev = null;
       Single_Node next;

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

