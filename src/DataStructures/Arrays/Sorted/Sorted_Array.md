# Sorted Array

## 📌 Overview

This example focuses on working with an Array whose elements are maintained or processed in sorted order.

A sorted array has its elements arranged according to an ordering rule, commonly ascending order.

```text
[1, 3, 5, 7, 9]
```

## 🧠 Why Sorted Arrays Matter

Keeping data sorted can make some operations easier or faster.

For example, a sorted array can be searched using **Binary Search**, which reduces the search space by half at every step.

```text
O(log n)
```

compared with a linear search:

```text
O(n)
```

## 🔍 Important Concepts

- Maintaining order
- Comparing elements
- Inserting into the correct position
- Searching sorted data
- Index manipulation

## ⏱️ Complexity

The complexity depends on the exact operation and implementation.

For a typical sorted array:

| Operation | Complexity |
|---|---:|
| Access | `O(1)` |
| Linear Search | `O(n)` |
| Binary Search | `O(log n)` |
| Insertion at arbitrary position | `O(n)` |

Insertion can require shifting existing elements to preserve the sorted order.

## 🎯 Learning Goal

Understand the benefits and costs of keeping an Array sorted and how ordering affects searching and insertion.
