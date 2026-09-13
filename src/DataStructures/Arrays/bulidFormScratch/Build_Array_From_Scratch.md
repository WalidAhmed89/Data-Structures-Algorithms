# Build Array From Scratch

## 📌 Overview

This example focuses on understanding how an Array-like data structure can be implemented manually instead of relying only on Java's built-in array operations.

## 🎯 Goal

Practice the fundamental ideas behind an array-based data structure:

- Internal storage
- Capacity
- Number of stored elements
- Adding elements
- Accessing elements
- Managing the available space

## 🧠 Main Idea

A custom Array implementation normally keeps an internal storage area and tracks how many elements are currently stored.

```text
Internal Storage
┌────┬────┬────┬────┬────┐
│ 10 │ 20 │ 30 │    │    │
└────┴────┴────┴────┴────┘
  0    1    2    3    4

Size = 3
Capacity = 5
```

The important distinction is:

- **Size** → number of elements currently stored.
- **Capacity** → number of elements the internal storage can hold.

## 🔍 What This Example Practices

- Creating a custom data structure
- Managing indexes
- Tracking size
- Working with internal storage
- Understanding array limitations

## ⏱️ Complexity

The exact complexity depends on the operations implemented in the current class.

For a standard array-based implementation:

| Operation | Complexity |
|---|---:|
| Access by index | `O(1)` |
| Append when space exists | `O(1)` |
| Search | `O(n)` |
| Traversal | `O(n)` |

If resizing is implemented, resizing itself requires copying elements and takes `O(n)`.

## 🎓 Learning Goal

Understand what happens behind an array-based collection instead of treating it as a black box.
