package Stacks;

public class Stack_with_LinkedList {
    //First we need to create the stack structure
    Stack_Node top;
    Stack_Node bottom;
    int length;
    //and make a constructor
    public Stack_with_LinkedList() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    //First method is (Push) is to add new stack node
    public void push(Object value){
        Stack_Node node = new Stack_Node(value);
        //check if the stack is empty will add this value in the first
        if(this.length == 0){
            this.top = this.bottom = node;
            length++;
            return;
        }else {
            //here we make the top reference instead of equals null, will reference for the last element before added to make easy way to pop method
            node.next = top;
            top = node;
            length++;
        }
        //if it doesn't will make the top reference to the new node and the new node is the top

    }

    //peek method will show the top element or the LAST ELEMENT as LIFO structure
    public Object peek(){
        //check if the stack is empty
        if(this.length == 0){
            return null;
        }
        //if it doesn't will return the top element
        return this.top.data;
    }

    //pop method is will delete the top element
    public Object pop(){
        if(length == 0){
            return null;
        }

        Object value = top.data;

        top = top.next;
        length--;

        if (length == 0){
            bottom = null;
        }

        return value;

    }
}
