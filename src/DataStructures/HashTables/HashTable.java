package HashTables;

public class HashTable {
    private Node[] data;

    public HashTable(int size) {
        this.data = new Node[size];
    }

    private int hash(String Key) {
        int hash = 0;
        for (int i = 0; i < Key.length(); i++) {
            hash = (hash + Key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public void set(String key, Object value) {
        int index = hash(key);
        this.data[index] = new Node(key, value);
    }

    public Object get(String key) {
        int index = hash(key);
        if (data[index] == null) {
            return null;
        }
        if (!data[index].key.equals(key)) {
            return null;
        }
        return data[index].value;
    }

    public void keys(){
         Node[] keysArray = {};
        for (int i = 0; i < this.data.length; i++) {
            System.out.println(this.data[i].key);
        }
    }

}
