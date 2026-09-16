# Breadth-First Search Implementation

This document explains the provided Java implementation of **Breadth-First Search (BFS)** for a binary tree.

The class provides two approaches:

1. `breadthFirstSearch()` — iterative BFS.
2. `breadthFirstSearchRecursion()` — recursive BFS using a Queue.

![BFS vs DFS](Images/bfs_vs_dfs.png)

## Expected Tree

The implementation uses `BinarySearchTree` nodes. The example structure is:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

BFS output:

```text
[9, 4, 20, 1, 6, 15, 170]
```

## Class and Root

```java
public class BreadthFirsSearch {
    static BinarySearchTree root = null;
}
```

`root` represents the starting node of the traversal.

The implementation uses the existing `BinarySearchTree` class, where each node has:

```java
left
right
value
```

---

# 1. Iterative BFS

```java
public static ArrayList breadthFirstSearch()
```

## Empty Tree Check

```java
if (root == null) {
    return null;
}
```

If there is no root, there is no tree to traverse.

## Result List

```java
ArrayList<Object> BFSList = new ArrayList<>();
```

`BFSList` stores node values in BFS order.

## Queue

```java
Queue<BinarySearchTree> BFSQueue = new LinkedList<>();
BFSQueue.add(root);
```

The Queue stores nodes that are waiting to be processed.

Initially:

```text
Queue:
[9]
```

## Main Loop

```java
while (!BFSQueue.isEmpty())
```

The algorithm continues until there are no nodes left in the Queue.

## Poll the Current Node

```java
BinarySearchTree currentNode = BFSQueue.poll();
```

`poll()` removes the first node from the Queue.

Because the Queue is FIFO, this produces level-order traversal.

## Add the Value

```java
BFSList.add(currentNode.value);
```

The current node's value is added to the result.

## Add Left Child

```java
if (currentNode.left != null) {
    BFSQueue.add(currentNode.left);
}
```

The left child is added to the back of the Queue.

## Add Right Child

```java
if (currentNode.right != null) {
    BFSQueue.add(currentNode.right);
}
```

The right child is then added to the back.

The implementation therefore processes children from **left to right**.

## Queue Example

For:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

The Queue changes approximately like this:

```text
Start:
[9]

Process 9:
[4, 20]

Process 4:
[20, 1, 6]

Process 20:
[1, 6, 15, 170]

Process 1:
[6, 15, 170]

Process 6:
[15, 170]

Process 15:
[170]

Process 170:
[]
```

Result:

```text
[9, 4, 20, 1, 6, 15, 170]
```

---

# 2. Recursive BFS

```java
public static ArrayList breadthFirstSearchRecursion(
    Queue<BinarySearchTree> BFSQueue,
    ArrayList<Object> BFSList)
```

This method performs the same BFS traversal, but uses recursion instead of a `while` loop.

## Empty Tree Base Case

```java
if (root == null) {
    return new ArrayList<>();
}
```

If the tree is empty, an empty result is returned.

## Empty Queue Base Case

```java
if (BFSQueue.isEmpty()) {
    return BFSList;
}
```

When the Queue contains no more nodes, traversal is complete.

## Process Current Node

```java
BinarySearchTree currentNode = BFSQueue.poll();
BFSList.add(currentNode.value);
```

The first Queue element is removed and its value is stored.

## Add Children

```java
if (currentNode.left != null) {
    BFSQueue.add(currentNode.left);
}

if (currentNode.right != null) {
    BFSQueue.add(currentNode.right);
}
```

The children are added to the back of the Queue.

## Recursive Call

```java
return breadthFirstSearchRecursion(BFSQueue, BFSList);
```

The method continues processing the Queue recursively.

### Important Point

The recursion does **not** replace the Queue.

The Queue is still what maintains the FIFO order required by BFS.

---

# Iterative vs Recursive BFS

| Feature | Iterative | Recursive |
|---|---|---|
| Uses Queue | Yes | Yes |
| Uses recursion | No | Yes |
| Traversal order | BFS | BFS |
| Time | O(n) | O(n) |
| Extra call stack | No | Yes |

Both approaches follow the same BFS traversal logic.

## Complexity

For `n` tree nodes:

### Iterative

```text
Time:  O(n)
Space: O(n)
```

### Recursive

```text
Time:  O(n)
Space: O(n)
```

The recursive version additionally uses the call stack.

## Implementation Notes

### 1. Raw ArrayList Return Type

The methods currently return:

```java
ArrayList
```

while the local result is:

```java
ArrayList<Object>
```

A generic return type such as:

```java
ArrayList<Object>
```

would provide better type safety.

### 2. Static Root

The implementation uses:

```java
static BinarySearchTree root = null;
```

The root therefore belongs to the class.

A more reusable traversal method could receive the root as a parameter.

### 3. Recursive Method Parameters

The recursive method receives the Queue and result list from the caller.

The Queue needs to be initialized with the root before recursive processing starts.

### 4. Tree vs Graph

This implementation traverses a tree and therefore does not use a `visited` set.

For a general graph, a `visited` structure is normally required to prevent repeated processing and infinite traversal through cycles.

## Core Algorithm

The entire iterative algorithm can be summarized as:

```text
Put root in Queue

while Queue is not empty:
    remove first node
    add its value to result
    add left child
    add right child
```

This is the fundamental mechanism of **Breadth-First Search**.
