# Binary Search Tree

A **Binary Search Tree (BST)** is a binary tree organized according to an ordering rule that makes searching, insertion, and deletion efficient when the tree is reasonably balanced.

For each node:

- Values in the **left subtree** are smaller than the node's value.
- Values in the **right subtree** are greater than the node's value.
- Duplicate handling depends on the implementation's chosen policy.

![Correct BST examples](Images/correct_bst.png)

## BST Rule

The rule applies recursively to the entire subtree, not only to the direct children.

```text
             8
           /   \\
          3     10
         / \\      \\
        1   6      14
           / \\    /
          4   7  13
```

For node `8`:

```text
Left subtree  -> values smaller than 8
Right subtree -> values greater than 8
```

The same rule must hold for every node.

## Invalid BSTs

A tree is invalid when a value violates the BST ordering rule somewhere in its subtree.

![Invalid BST examples](Images/invalid_bst.png)

Typical violations include:

- A duplicate value when the chosen BST policy forbids duplicates.
- A value in the right subtree that is smaller than an ancestor.
- A value in the left subtree that is greater than an ancestor.

## Main Components

### Node

A BST node stores:

- `value`
- `left` reference
- `right` reference

```text
       [value]
       /      \\
    left     right
```

### Root

The **root** is the top/starting node of the tree. Every other node is reached by following `left` or `right` references.

## Main Operations

### Insert

Adds a value while preserving the BST ordering rule.

```text
value < current.value -> go left
value > current.value -> go right
```

### Search / Lookup

Search uses the same comparisons. At each node, it chooses only one subtree instead of scanning the whole tree.

Example searching for `7`:

```text
8 -> left
3 -> right
6 -> right
7 -> found
```

### Remove

Deletion depends on the target node's children:

1. **Leaf** — remove the node.
2. **One child** — connect the parent directly to the child.
3. **Two children** — replace the node using a value that preserves the BST ordering, commonly the in-order successor.

## Complexity

For a BST with height `h`:

| Operation | Average / Balanced | Worst Case |
|---|---:|---:|
| Search | O(log n) | O(n) |
| Insert | O(log n) | O(n) |
| Remove | O(log n) | O(n) |
| Traversal | O(n) | O(n) |

The worst case occurs when the tree becomes highly unbalanced:

```text
10
  \\
   20
     \\
      30
        \\
         40
```

In that situation, the tree behaves similarly to a linked list.

## Tree Traversals

### In-Order

```text
Left -> Root -> Right
```

For a valid BST, in-order traversal produces values in sorted order.

### Pre-Order

```text
Root -> Left -> Right
```

### Post-Order

```text
Left -> Right -> Root
```

## Applications

BSTs can be used for:

- Ordered data
- Searching
- Maintaining sorted data
- Range-related operations
- Ordered sets/maps

Balanced BST variants such as AVL Trees and Red-Black Trees are designed to keep tree height controlled.

## Learning Goals

- Understand the BST ordering rule.
- Understand root, left child, and right child.
- Understand insertion and lookup.
- Understand the three major deletion cases.
- Understand why tree height affects complexity.
- Understand why a BST can become unbalanced.
- Understand why in-order traversal produces sorted values.
