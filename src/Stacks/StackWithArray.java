package Stacks;

public class StackWithArray {

    private Object[] arr;
    private int index;

    public StackWithArray(int capacity){
        arr = new Object[capacity];
    }

    public void push(Object value){

        if(index == arr.length){
            throw new IllegalStateException("Stack is full");
        }

        arr[index++] = value;
    }

    public Object pop(){

        if(index == 0){
            return null;
        }

        Object value = arr[--index];
        arr[index] = null;

        return value;
    }

    public Object peek(){

        if(index == 0){
            return null;
        }

        return arr[index - 1];
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public int size(){
        return index;
    }
}