# Arrays

An **Array** is a linear data structure that stores elements in a fixed-size, contiguous structure and allows direct access using an index.

This section contains the Array implementations and examples practiced in this repository.

## 📚 Topics Covered

- Basic Array operations
- Building an Array from scratch
- Reversing an Array
- Working with Sorted Arrays

## 🧠 Core Concepts

### Indexing

Array elements are accessed using an index.

```text
Index:  0   1   2   3
Value: 10  20  30  40
```

Accessing an element by index is typically:

```text
O(1)
```

### Traversal

Visiting the elements one by one takes:

```text
O(n)
```

### Insertion and Deletion

For a regular array, inserting or deleting an element may require shifting other elements, so the operation can take:

```text
O(n)
```

## 🎯 Why Practice Arrays From Scratch?

Implementing Array behavior manually helps understand:

- Index-based access
- Fixed capacity
- Size vs. capacity
- Element shifting
- Traversal
- Basic data structure design

## 📂 Examples

- [Build Array From Scratch](./BuildArrayFromScratch/README.md)
- [Basic Array](./BasicArray/README.md)
- [Reverse Array](./ReverseArray/README.md)
- [Sorted Array](./SortedArray/README.md)

## 📊 Complexity Overview

| Operation | Typical Complexity |
|---|---:|
| Access by index | `O(1)` |
| Search | `O(n)` |
| Traversal | `O(n)` |
| Insertion | `O(n)` |
| Deletion | `O(n)` |

> The exact complexity of an operation depends on where the operation is performed and on the specific implementation.

## 🎓 Learning Goal

The goal of this section is not only to use Java arrays, but to understand the fundamental behavior and trade-offs behind array-based data structures.
