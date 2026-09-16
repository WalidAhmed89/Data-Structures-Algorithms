# Depth-First Search Implementation

This document explains the provided Java implementation of **Depth-First Search (DFS)** for a Binary Search Tree.

The class implements three DFS traversal methods:

1. `DFSInOrder()`
2. `DFSPostorder()`
3. `DFSPreorder()`

![BFS vs DFS](Images/bfs_vs_dfs.png)

## Expected Tree

The code comments use this example:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

The intended traversal results shown in the comments are:

```text
In-Order:
[1, 4, 6, 9, 15, 20, 170]

Post-Order:
[1, 6, 4, 15, 170, 20, 9]

Pre-Order:
[9, 4, 1, 6, 20, 15, 170]
```

## Class

```java
public class DepthFirstSearch {
    static BinarySearchTree root = null;
}
```

The implementation uses the existing `BinarySearchTree` class.

`root` is the starting point of the traversal.

---

# 1. In-Order DFS

```java
ArrayList<Integer> DFSInOrder() {
    return traverseInOrder(root, new ArrayList<>());
}
```

The public method creates a new result list and starts traversal from `root`.

The traversal rule is:

```text
Left → Root → Right
```

## traverseInOrder()

```java
public ArrayList<Integer> traverseInOrder(
        BinarySearchTree node,
        ArrayList<Integer> list)
```

The method recursively explores the left subtree, processes the current node, then explores the right subtree.

Conceptually:

```text
traverse(left)
add current
traverse(right)
```

For the example tree, the intended result is:

```text
[1, 4, 6, 9, 15, 20, 170]
```

### Important Implementation Issue

The provided code currently contains:

```java
list.add(node.left.value);
```

This accesses `node.left` instead of adding:

```java
node.value
```

It can also cause a `NullPointerException` when the current node has no left child.

So the **documented intended traversal order** is correct, but the current implementation needs review before it will correctly execute In-Order traversal.

The intended operation is conceptually:

```text
traverse left subtree
add current node's value
traverse right subtree
```

---

# 2. Post-Order DFS

```java
ArrayList<Integer> DFSPostorder() {
    return traversePostorderr(root, new ArrayList<>());
}
```

Post-Order follows:

```text
Left → Right → Root
```

## traversePostorderr()

The method first traverses the left subtree:

```java
if (node.left != null) {
    traversePostorderr(node.left, list);
}
```

Then the right subtree:

```java
if (node.right != null) {
    traversePostorderr(node.right, list);
}
```

Finally, it adds the current node.

Conceptually:

```text
traverse(left)
traverse(right)
add current
```

The intended result for the example is:

```text
[1, 6, 4, 15, 170, 20, 9]
```

### Important Implementation Issue

The provided code currently contains:

```java
list.add(node.left.value);
```

The current node's value should be used for the Root step of Post-Order.

As written, this can access the wrong value or cause a `NullPointerException`.

---

# 3. Pre-Order DFS

```java
ArrayList<Integer> DFSPreorder() {
    return traversePreorder(root, new ArrayList<>());
}
```

Pre-Order follows:

```text
Root → Left → Right
```

## traversePreorder()

The intended conceptual order is:

```text
add current
traverse left
traverse right
```

For the example tree:

```text
[9, 4, 1, 6, 20, 15, 170]
```

### Important Implementation Issue

The provided code starts with:

```java
list.add(node.left.value);
```

This again accesses the left child instead of the current node.

It also happens before checking:

```java
if (node.left != null)
```

so a leaf node can cause a `NullPointerException`.

The intended Pre-Order operation is to add:

```text
current node value
```

before traversing either child.

---

# DFS Traversal Comparison

Using:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

## In-Order

```text
Left → Root → Right

1 → 4 → 6 → 9 → 15 → 20 → 170
```

## Pre-Order

```text
Root → Left → Right

9 → 4 → 1 → 6 → 20 → 15 → 170
```

## Post-Order

```text
Left → Right → Root

1 → 6 → 4 → 15 → 170 → 20 → 9
```

![BFS vs DFS](Images/bfs_vs_dfs.png)

## Complexity

For `n` nodes:

```text
Time: O(n)
```

Every node should be visited once.

For the recursive implementation:

```text
Space: O(h)
```

where `h` is the height of the tree.

A balanced tree has approximately:

```text
h = O(log n)
```

while a highly unbalanced tree can have:

```text
h = O(n)
```

## Implementation Notes

### 1. Static Root

The implementation declares:

```java
static BinarySearchTree root = null;
```

The root therefore belongs to the class.

A reusable traversal implementation could instead receive the root as a method argument.

### 2. Null Root Handling

The traversal methods currently call methods such as:

```java
traverseInOrder(root, new ArrayList<>())
```

without first checking whether `root` is `null`.

A robust implementation should define how an empty tree is handled.

### 3. Current Node vs Left Child

All three traversal methods currently use:

```java
node.left.value
```

when adding a value.

For DFS traversal, the value being added at the Root step should conceptually be:

```text
node.value
```

This is especially important for leaf nodes, where `node.left` is `null`.

### 4. Method Naming

The method:

```java
traversePostorderr()
```

contains an extra `r` at the end of `Postorderr`.

This does not affect the algorithm, but `traversePostorder()` would be clearer naming.

### 5. Access Modifiers

The three wrapper methods:

```java
DFSInOrder()
DFSPostorder()
DFSPreorder()
```

do not explicitly declare `public`.

They therefore use package-private access.

## Core DFS Idea

All three traversals use the same recursive structure.

The difference is **when the current node is added**:

```text
Pre-Order:
Root → Left → Right

In-Order:
Left → Root → Right

Post-Order:
Left → Right → Root
```

That ordering is the key concept behind DFS traversal of binary trees.
