# Depth-First Search (DFS)

**Depth-First Search (DFS)** is a tree/graph traversal technique that explores a path as deeply as possible before backtracking.

For a tree, DFS starts from a node and recursively explores its children before returning to process other branches.

![BFS vs DFS](Images/bfs_vs_dfs.png)

## Main Idea

Unlike BFS, which processes nodes level by level, DFS goes deep into a branch before moving to another branch.

For example:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

DFS can visit this tree using three common traversal orders:

```text
In-Order:   1 → 4 → 6 → 9 → 15 → 20 → 170

Post-Order: 1 → 6 → 4 → 15 → 170 → 20 → 9

Pre-Order:  9 → 4 → 1 → 6 → 20 → 15 → 170
```

## DFS Traversal Types

For binary trees, DFS is commonly represented by three traversal orders.

### 1. In-Order

```text
Left → Root → Right
```

Example:

```text
        9
      /   \
     4     20
    / \   /  \
   1   6 15  170
```

Traversal:

```text
1 → 4 → 6 → 9 → 15 → 20 → 170
```

For a valid Binary Search Tree, In-Order traversal produces values in sorted order.

### 2. Pre-Order

```text
Root → Left → Right
```

Traversal:

```text
9 → 4 → 1 → 6 → 20 → 15 → 170
```

Pre-Order processes the current node before its children.

### 3. Post-Order

```text
Left → Right → Root
```

Traversal:

```text
1 → 6 → 4 → 15 → 170 → 20 → 9
```

Post-Order processes the current node after both subtrees.

## DFS vs BFS

![BFS vs DFS](Images/bfs_vs_dfs.png)

| Feature | DFS | BFS |
|---|---|---|
| Strategy | Explore deeply first | Explore level by level |
| Common implementation | Recursion / Stack | Queue |
| Binary tree orders | In-Order, Pre-Order, Post-Order | Level-Order |
| Main idea | Depth first | Breadth first |

## Recursion

DFS is naturally suited to recursion.

The general recursive idea is:

```text
1. Visit/process the current node according to the traversal.
2. Traverse the left subtree.
3. Traverse the right subtree.
4. Return when the subtree is finished.
```

The exact order of step 1 determines whether the traversal is Pre-Order, In-Order, or Post-Order.

## Complexity

For a tree containing `n` nodes:

```text
Time: O(n)
```

Every node is visited once.

The recursive call stack depends on the tree height:

```text
Space: O(h)
```

where `h` is the tree height.

In a balanced tree, the height is approximately `O(log n)`. In a highly unbalanced tree, the height can become `O(n)`.

## Applications

DFS is commonly used for:

- Tree traversal
- Graph traversal
- Path exploration
- Backtracking
- Cycle-related graph algorithms
- Topological sorting
- Connected components
- Searching structures where deep exploration is useful

For general graphs, DFS normally tracks visited vertices to avoid processing cycles repeatedly.

## Learning Goals

By studying DFS, you should understand:

- What Depth-First Search means.
- How DFS explores a tree deeply before backtracking.
- In-Order traversal.
- Pre-Order traversal.
- Post-Order traversal.
- Recursive DFS.
- DFS vs BFS.
- DFS time and space complexity.
