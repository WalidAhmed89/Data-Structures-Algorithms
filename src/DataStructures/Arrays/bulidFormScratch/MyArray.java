package Arrays.bulidFormScratch;

public class MyArray {
    int length;
    Object[] data;
    public MyArray(){
        this.length = 0;
        this.data = new Object[10];//Capacity --> 10;
    }

    public Object getIndex(int index) {
        if(index < 0 || index >= length){
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
    }

    public int push(Object item){
        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    public Object pop(){
        if(this.length == 0){
            throw new IndexOutOfBoundsException("Array is empty");
        }
        Object lastItem = this.data[this.length-1];
        this.data[this.length-1] = null;
        this.length--;
        return lastItem + " Was Deleted successfully";

    }

    private void shiftItems(int index) {
        for (int i = index; i < this.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data[length-1] = null;
        this.length--;
    }

    public Object Delete(int index){
        if(this.length == 0){
            throw new IndexOutOfBoundsException("Array is empty");
        }
        Object lastItem = this.data[index];
        this.data[index] = null;
        this.shiftItems(index);
        return lastItem + " Was Deleted successfully";
    }


}
