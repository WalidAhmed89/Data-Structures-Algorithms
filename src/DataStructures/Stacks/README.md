# Stack

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.

The last element added to the Stack is the first element removed.

![Stack Data Structure](Images/stack.png)

## LIFO

**LIFO** means:

> **Last In, First Out**

For example, if we push:

```text
A
B
C
```

`C` is the most recently added element, so it is the first element removed.

```text
Top
 ↓
[C]
[B]
[A]
```

After `pop()`:

```text
Top
 ↓
[B]
[A]
```

The value removed is `C`.

## Main Concept: Top

The **Top** is the position where Stack operations take place.

- `push()` adds an element to the Top.
- `pop()` removes an element from the Top.
- `peek()` reads the Top element without removing it.

Unlike a Queue, a Stack does not normally use separate insertion and removal ends.

## Core Operations

### Push

`push()` adds a new element to the Top.

```text
Before:

Top
 ↓
[C]
[B]
[A]

push(D)

After:

Top
 ↓
[D]
[C]
[B]
[A]
```

### Pop

`pop()` removes the Top element.

```text
Before:

Top
 ↓
[D]
[C]
[B]
[A]

pop() → D

After:

Top
 ↓
[C]
[B]
[A]
```

### Peek

`peek()` returns the Top element without removing it.

```text
Top
 ↓
[C]
[B]
[A]

peek() → C
```

The Stack remains unchanged.

## Complexity

For a Stack implemented with an array or a linked list where the Top is directly accessible:

| Operation | Typical Complexity |
|---|---:|
| Push | O(1) |
| Pop | O(1) |
| Peek | O(1) |
| Is Empty | O(1) |
| Size | O(1) |

## Common Applications

Stacks are commonly used for:

- Function call stacks
- Undo/Redo systems
- Expression evaluation
- Parentheses matching
- Backtracking
- Depth-First Search (DFS)
- Browser navigation history

## Stack Implementations

A Stack can be implemented using different data structures.

This section demonstrates two implementations:

1. **Stack using a Singly Linked List**
2. **Stack using an Array**

Both implementations provide the main Stack operations:

- `push`
- `pop`
- `peek`

## Stack vs Queue

| Feature | Stack | Queue |
|---|---|---|
| Principle | LIFO | FIFO |
| Add | Top | Back / Rear |
| Remove | Top | Front / Head |
| Main insertion operation | Push | Enqueue |
| Main removal operation | Pop | Dequeue |

## Learning Goals

By studying this section, you should understand:

- The LIFO principle.
- The role of the Top.
- Push, Pop, and Peek.
- How a Stack can be implemented with a Linked List.
- How a Stack can be implemented with an Array.
- The complexity of Stack operations.
- The difference between Stack and Queue.
