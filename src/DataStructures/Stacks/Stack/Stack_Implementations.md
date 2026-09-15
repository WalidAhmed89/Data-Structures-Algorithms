# Stack Implementations

This document explains the two Stack implementations provided in this section:

1. `Stack_with_LinkedList`
2. `StackWithArray`

Both implementations follow the **LIFO (Last In, First Out)** principle.

![Stack Data Structure](../Images/stack.png)

---

# 1. Stack with Linked List

The Linked List implementation contains:

- `Stack_Node`
- `Stack_with_LinkedList`

## Stack_Node

```java
public class Stack_Node {
    Object data;
    Stack_Node next;

    public Stack_Node(Object data){
        this.data = data;
        this.next = null;
    }
}
```

Each node contains:

- `data` — the value stored in the node.
- `next` — a reference to the next node.

## Stack_with_LinkedList

The Stack maintains:

```java
Stack_Node top;
Stack_Node bottom;
int length;
```

### top

`top` points to the element that will be returned by `peek()` and removed by `pop()`.

### bottom

`bottom` points to the bottom element of the Stack.

### length

`length` stores the number of elements currently inside the Stack.

## Constructor

```java
public Stack_with_LinkedList() {
    this.top = null;
    this.bottom = null;
    this.length = 0;
}
```

A new Stack starts empty.

```text
top = null
bottom = null
length = 0
```

## push()

```java
public void push(Object value)
```

`push()` creates a new node and adds it to the Top.

### Empty Stack

When the Stack is empty:

```java
this.top = this.bottom = node;
```

Both `top` and `bottom` reference the new node.

```text
top
 ↓
[A]
 ↑
bottom
```

### Non-empty Stack

For an existing Stack:

```java
node.next = top;
top = node;
```

The new node points to the previous Top, then becomes the new Top.

Example:

```text
Before:

top
 ↓
[B]
[A]
 ↑
bottom

push(C)

After:

top
 ↓
[C]
[B]
[A]
 ↑
bottom
```

### Complexity

**O(1)**

Only a few references are changed.

## peek()

```java
public Object peek()
```

`peek()` returns:

```java
return this.top.data;
```

It reads the Top without removing it.

If the Stack is empty, it returns `null`.

### Complexity

**O(1)**

## pop()

```java
public Object pop()
```

`pop()` removes and returns the Top element.

The implementation first stores:

```java
Object value = top.data;
```

Then moves the Top:

```java
top = top.next;
```

Finally, it decreases the length:

```java
length--;
```

If the removed element was the only element:

```java
if (length == 0){
    bottom = null;
}
```

This keeps the empty Stack state consistent.

### Example

```text
Before:

top
 ↓
[C]
[B]
[A]
 ↑
bottom

pop() → C

After:

top
 ↓
[B]
[A]
 ↑
bottom
```

### Complexity

**O(1)**

The implementation directly accesses `top`.

---

# 2. Stack with Array

The array implementation is:

```java
public class StackWithArray {

    private Object[] arr;
    private int index;
```

It stores Stack elements inside an array.

## Constructor

```java
public StackWithArray(int capacity){
    arr = new Object[capacity];
}
```

The constructor creates an array with a fixed capacity.

The `index` field starts at its default value:

```text
index = 0
```

It represents the position where the next pushed element will be stored.

## push()

```java
public void push(Object value)
```

Before inserting, the implementation checks whether the Stack is full:

```java
if(index == arr.length){
    throw new IllegalStateException("Stack is full");
}
```

Then:

```java
arr[index++] = value;
```

The value is stored at the current index, and the index is incremented.

Example:

```text
push(A)
push(B)
push(C)

Array:

index
  ↓
[ A ][ B ][ C ][   ]
             ↑
          next position
```

The last inserted element, `C`, is the Top.

### Complexity

**O(1)**

## pop()

```java
public Object pop()
```

If the Stack is empty:

```java
if(index == 0){
    return null;
}
```

Otherwise:

```java
Object value = arr[--index];
arr[index] = null;
```

The index is first moved backward, so it points to the current Top.

The value is returned and the array slot is cleared.

Example:

```text
Before:

[ A ][ B ][ C ][   ]
             ↑
           index

pop() → C

After:

[ A ][ B ][   ][   ]
         ↑
       index
```

### Complexity

**O(1)**

## peek()

```java
public Object peek()
```

If empty, it returns `null`.

Otherwise:

```java
return arr[index - 1];
```

The Top is located immediately before `index`.

### Complexity

**O(1)**

## isEmpty()

```java
public boolean isEmpty(){
    return index == 0;
}
```

The Stack is empty when `index` is zero.

### Complexity

**O(1)**

## size()

```java
public int size(){
    return index;
}
```

Because `index` tracks the number of stored elements, it can be returned directly.

### Complexity

**O(1)**

---

# Linked List vs Array Implementation

| Feature | Linked List | Array |
|---|---|---|
| Push | O(1) | O(1) |
| Pop | O(1) | O(1) |
| Peek | O(1) | O(1) |
| Size | O(1) | O(1) |
| Capacity | Dynamic | Fixed in this implementation |
| Extra node references | Yes | No |
| Overflow behavior | Not capacity-limited by this implementation | Throws `IllegalStateException` when full |

## Important Implementation Notes

### `Object` instead of Generics

Both implementations use `Object` for stored values.

For example:

```java
Object data;
```

This provides flexibility but sacrifices compile-time type safety.

A generic Stack could later use:

```java
Stack<T>
```

### Linked List `bottom`

The Linked List implementation maintains `bottom`, even though `pop()` only needs `top`.

This keeps a reference to the bottom of the Stack and makes the structure explicit.

### Array Capacity

`StackWithArray` uses a fixed-size array.

If:

```java
index == arr.length
```

the Stack is considered full and `push()` throws an exception.

This implementation does not automatically resize the array.

## Overall Complexity

Both implementations provide constant-time core Stack operations:

```text
push() → O(1)
pop()  → O(1)
peek() → O(1)
```

The main difference is how the underlying storage is managed:

- Linked List → nodes connected through references.
- Array → elements stored in an array with an index.
