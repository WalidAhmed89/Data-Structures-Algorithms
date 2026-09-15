# Linked List

A **Linked List** is a linear data structure made of nodes. Each node stores data and one or more references that connect it to other nodes.

Unlike an array, linked-list elements are not required to be stored in contiguous memory locations. The structure is built by connecting nodes through references.

## Main Concepts

### Node

A **Node** is the basic building block of a linked list.

A node usually contains:

- **Data** — the value stored in the node.
- **Next** — a reference to the next node.

A doubly linked-list node also contains:

- **Previous** — a reference to the previous node.

### Head

`Head` points to the first node in the linked list.

### Tail

`Tail` points to the last node in the linked list.

Maintaining a tail reference allows an append operation to be performed in **O(1)** time in the implementations in this section.

## Singly Linked List

A **Singly Linked List** contains one reference in each node:

`data + next`

The `next` reference points to the following node.

![Singly Linked List](images/singly_linked_list.png)

The final node points to `null`, which indicates the end of the list.

### Typical Operations

- Append an item
- Prepend an item
- Search for an item
- Insert an item
- Remove an item
- Traverse the list
- Reverse the list

## Doubly Linked List

A **Doubly Linked List** contains two references in each node:

`previous + data + next`

The `next` reference points forward, while `previous` points backward.

![Doubly Linked List](doubly_linked_list.png)

The first node has no previous node, and the last node has no next node.

## Singly vs Doubly Linked List

| Feature | Singly Linked List | Doubly Linked List |
|---|---|---|
| Next reference | Yes | Yes |
| Previous reference | No | Yes |
| Forward traversal | Yes | Yes |
| Backward traversal | No | Yes |
| Memory per node | Lower | Higher |
| Reverse traversal | Not directly supported | Supported through `previous` |

## Time Complexity

| Operation | Typical Complexity |
|---|---:|
| Access by index | O(n) |
| Search | O(n) |
| Append with `tail` | O(1) |
| Prepend | O(1) |
| Insert after a known node | O(1) |
| Remove head | O(1) |
| Traversal | O(n) |
| Reverse | O(n) |

For a doubly linked list, removing a **known node** can be O(1) because the node already has references to both its previous and next nodes.

## Linked List vs Array

### Array

Arrays provide fast random access:

`array[index]` → **O(1)**

However, inserting or removing elements in the middle can require shifting elements.

### Linked List

Linked lists do not provide direct random access. To reach a position, the list normally has to be traversed from the head.

Their main advantage is efficient insertion and removal when the relevant node/reference is already known.

## This Section

This section contains two Java implementations:

- `SingleLinkedList`
- `DoublyLinkedList`

Both implementations use custom Node classes and `Object` as the data type.

Using `Object` makes the examples flexible, but a generic implementation such as `Node<T>` would provide stronger type safety.

## Learning Goals

By studying this section, you should understand:

- How nodes are connected.
- The role of `head` and `tail`.
- The difference between singly and doubly linked lists.
- How traversal works.
- How insertion and removal change node references.
- How a singly linked list can be reversed.
- The time and space trade-offs of linked lists.
