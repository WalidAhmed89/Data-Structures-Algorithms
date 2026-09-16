# Breadth-First Search (BFS)

**Breadth-First Search (BFS)** is a traversal algorithm that explores a structure **level by level**.

![BFS vs DFS](Images/bfs_vs_dfs.png)

## Main Idea

BFS visits all nodes at the current level before moving to the next level.

Example:

```text
        0
      / | \
     1  2  3
    /|  |  |\
   4 5  6  7
```

BFS order:

```text
0 → 1 → 2 → 3 → 4 → 5 → 6 → 7
```

## Why BFS Uses a Queue

BFS commonly uses a **Queue** because a Queue follows **FIFO (First In, First Out)**.

The basic process is:

```text
1. Put the source/root into the Queue.
2. Remove the first node.
3. Process the node.
4. Add its children/neighbors to the back of the Queue.
5. Repeat until the Queue is empty.
```

This guarantees that nodes closer to the source are processed first.

## BFS Step by Step

For:

```text
        0
      / | \
     1  2  3
    /|  |  |\
   4 5  6  7
```

The Queue evolves approximately like:

```text
Start:       [0]
Process 0:   [1, 2, 3]
Process 1:   [2, 3, 4, 5]
Process 2:   [3, 4, 5, 6]
Process 3:   [4, 5, 6, 7]
...
```

Final output:

```text
[0, 1, 2, 3, 4, 5, 6, 7]
```

## BFS vs DFS

| Feature | BFS | DFS |
|---|---|---|
| Strategy | Level by level | Go as deep as possible |
| Common structure | Queue | Stack / Recursion |
| Tree traversal | Level-order | Depth-oriented |
| Shortest path in unweighted graph | Yes | Not generally |

![BFS vs DFS](Images/bfs_vs_dfs.png)

## BFS on Trees

For a binary tree, BFS processes:

```text
Root
 ↓
Children
 ↓
Grandchildren
 ↓
...
```

The implementation in this section specifically performs BFS on a tree using its `left` and `right` child references.

## BFS on Graphs

BFS can also be used with graphs.

A graph implementation normally needs a `visited` set to avoid processing the same vertex repeatedly, especially when cycles exist.

Conceptually:

```text
Queue ← source
visited ← source

while Queue is not empty:
    node ← Queue.poll()

    for each neighbor:
        if neighbor is not visited:
            mark visited
            Queue.add(neighbor)
```

## Complexity

For a tree containing `n` nodes:

```text
Time:  O(n)
Space: O(n) worst case
```

Every node is processed once.

The Queue can contain multiple nodes waiting to be processed.

## Applications

BFS is commonly used for:

- Level-order tree traversal
- Shortest paths in unweighted graphs
- Finding nodes by distance
- Network traversal
- State-space search
- Minimum-edge path problems

## Learning Goals

By studying BFS, you should understand:

- Level-order traversal.
- Why BFS uses a Queue.
- FIFO behavior.
- Iterative BFS.
- Recursive BFS using a Queue.
- BFS vs DFS.
- Time and space complexity.
