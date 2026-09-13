# Reverse Array

## 📌 Overview

This example focuses on reversing the order of elements in an Array.

For example:

```text
Before:
[1, 2, 3, 4, 5]

After:
[5, 4, 3, 2, 1]
```

## 🧠 Main Idea

A common approach is to use two positions:

```text
left  → beginning
right → end
```

Then swap the elements and move both positions toward the center.

```text
[1, 2, 3, 4, 5]
 ↑           ↑
left       right

swap

[5, 2, 3, 4, 1]
    ↑       ↑
   left   right
```

The process continues until the two positions meet.

## ⏱️ Complexity

| Resource | Complexity |
|---|---:|
| Time | `O(n)` |
| Extra Space | `O(1)` for an in-place reversal |

An in-place implementation modifies the original array instead of creating another array.

## 🎯 Learning Goal

Practice array traversal, index manipulation, swapping, and in-place algorithms.
