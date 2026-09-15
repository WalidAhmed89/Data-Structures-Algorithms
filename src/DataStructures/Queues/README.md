# Queue

A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle.

The first element added to the Queue is the first element removed.

![Queue Data Structure](Images/queue.png)

## FIFO

FIFO means:

> **First In, First Out**

For example, if we enqueue:

```text
3 → 4 → 5 → 6 → 7 → 8
```

The first element to be removed is `3`.

If we then enqueue `9`, it is added at the back:

```text
Front / Head                         Back / Tail
      ↓                                  ↓
     [4] → [5] → [6] → [7] → [8] → [9]
```

The Queue therefore behaves similarly to a real-world waiting line: elements join from the back and leave from the front.

## Main Queue Terminology

### Front / Head

The **front** is the position from which elements are removed.

It is also commonly called:

- `Front`
- `Head`

### Back / Tail / Rear

The **back** is the position where new elements are added.

It is also commonly called:

- `Back`
- `Tail`
- `Rear`

## Core Operations

### Enqueue

**Enqueue** adds a new element to the back of the Queue.

```text
Before:

Front → [3] → [4] → [5] ← Back

Enqueue(6)

After:

Front → [3] → [4] → [5] → [6] ← Back
```

### Dequeue

**Dequeue** removes the element from the front of the Queue.

```text
Before:

Front → [3] → [4] → [5] ← Back

Dequeue()

After:

Front → [4] → [5] ← Back
```

The removed value is `3`.

### Peek

**Peek** returns the front element without removing it.

```text
Front → [3] → [4] → [5] ← Back

Peek() → 3
```

The Queue remains unchanged.

## Queue Operations Complexity

With a linked-list implementation that maintains both `first` and `last` references:

| Operation | Complexity |
|---|---:|
| Enqueue | O(1) |
| Dequeue | O(1) |
| Peek | O(1) |
| Search | O(n) |
| Traversal | O(n) |

## Common Applications

Queues are useful when data needs to be processed in arrival order.

Examples include:

- Printer job scheduling
- Task processing
- Request handling
- Breadth-First Search (BFS)
- Customer waiting systems
- Message processing

## Queue Implementations

A Queue can be implemented using different data structures, including:

- Arrays
- Linked Lists
- Circular arrays
- Deques

This section uses a **Singly Linked List** to implement the Queue.

## Learning Goals

By studying this section, you should understand:

- The FIFO principle.
- The difference between the front and back of a Queue.
- Enqueue, Dequeue, and Peek.
- How a Queue can be implemented with a Linked List.
- Why maintaining references to both ends gives O(1) enqueue and dequeue operations.
