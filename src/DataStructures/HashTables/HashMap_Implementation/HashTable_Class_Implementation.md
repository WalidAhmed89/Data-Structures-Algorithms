# HashTable Class Implementation

## Overview

This file documents the custom `HashTable` class in:

```text
DataStructures.HashTables
```

The implementation stores key-value pairs inside a `Node[]` array and uses a custom hash function to calculate indexes.

## Fields

```java
private Node[] data;
```

The internal storage array.

```text
Index:  0   1   2   3   4
        ↓   ↓   ↓   ↓   ↓
      Node Node ... ...
```

## Constructor

```java
public HashTable(int size) {
    this.data = new Node[size];
}
```

Creates a table with the requested capacity.

## `hash()`

```java
private int hash(String Key) {
    int hash = 0;
    for (int i = 0; i < Key.length(); i++) {
        hash = (hash + Key.charAt(i) * i) % this.data.length;
    }
    return hash;
}
```

The method converts a `String` key into an array index.

The `% this.data.length` operation ensures the result is within the array range.

## `set()`

```java
public void set(String key, Object value) {
    int index = hash(key);
    this.data[index] = new Node(key, value);
}
```

Flow:

```text
key + value
     ↓
  hash(key)
     ↓
   index
     ↓
Node(key, value)
     ↓
 data[index]
```

## `get()`

```java
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
```

The method hashes the key, checks whether the slot contains a node, verifies the key, and returns the value.

## `keys()`

The current method:

```java
public void keys(){
    Node[] keysArray = {};
    for (int i = 0; i < this.data.length; i++) {
        System.out.println(this.data[i].key);
    }
}
```

intends to print all stored keys.

However, it currently assumes every array position contains a `Node`. If a position is `null`, accessing `.key` causes a `NullPointerException`.

`keysArray` is also currently unused.

## `Node`

The `Node` class stores:

```java
public Object key;
public Object value;
```

Conceptually:

```text
Node
├── key
└── value
```

Example:

```text
("Walid", 19)
```

## Collision Behavior

The current `set()` implementation directly replaces:

```java
data[index]
```

Therefore, if two different keys hash to the same index, the previous node is overwritten.

This implementation does not yet use chaining or probing.

## Complexity

The hash function itself processes every character of the key:

```text
O(k)
```

where `k` is the key length.

With bounded/constant key length, Hash Table lookup and insertion are commonly described as approximately `O(1)` average.

## Learning Goal

This implementation demonstrates the basic mechanics behind a Hash Table:

```text
Key
 ↓
Hash Function
 ↓
Array Index
 ↓
Node
 ↓
Value
```
