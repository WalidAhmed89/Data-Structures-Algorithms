# Data Structures & Algorithms in Java

A learning-focused repository for studying **Data Structures and Algorithms (DSA)** using Java.

The goal of this project is to understand how common data structures and algorithms work by implementing them from scratch, documenting the concepts, and practicing their use through small examples.

> **Focus:** Learning, understanding, implementation, and practice — not production-ready libraries.

---

## 📚 Repository Structure

```text
DataStructures/
├── Arrays/
├── LinkedList/
│   ├── SingleLinkedList/
│   └── DoublyLinkedList/
├── HashTables/
├── Queues/
├── Stacks/
├── Trees/
│   └── BinarySearchTree/
└── Graphs/

Algorithms/
├── BFS/
├── DFS/
├── Sorting/
│   ├── BubbleSort/
│   ├── InsertionSort/
│   ├── MergeSort/
│   └── SelectionSort/
└── Recursion/
```

Each topic is organized around its implementation and documentation so the code can be studied together with the underlying concept.

---

# 🌳 Data Structures

Data structures are ways of organizing and storing data so that it can be accessed and manipulated efficiently.

## 1. Array

Arrays store elements in a contiguous, indexed structure.

### Main concepts

- Index-based access
- Fixed-size storage
- Traversal
- Searching
- Updating elements

### Example

```java
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers[2]); // 30
```

📖 **Documentation:** `DataStructures/Arrays/README.md`

---

## 2. Linked List

A Linked List stores data in **nodes**, where each node contains data and a reference to another node.

The repository contains:

- Singly Linked List
- Doubly Linked List

### Main concepts

- Node
- Head
- Tail
- Next
- Previous
- Traversal
- Insertion
- Removal
- Reversal

### Example

```text
Head
 ↓
10 → 20 → 30 → 40 → null
                         ↑
                        Tail
```

📖 **General documentation:** [LinkedList/README.md](DataStructures/LinkedList/README.md)

📖 **Singly Linked List:** [SingleLinkedList_Implementation.md](DataStructures/LinkedList/SingleLinkedList/SingleLinkedList_Implementation.md)

📖 **Doubly Linked List:** [DoublyLinkedList_Implementation.md](DataStructures/LinkedList/DoublyLinkedList/DoublyLinkedList_Implementation.md)

---

## 3. Hash Table

A Hash Table stores data using **key-value pairs** and a hash function to determine where values are stored.

### Main concepts

- Key
- Value
- Hash Function
- Hashing
- Buckets
- Collisions
- Lookup

### Example

```java
HashTable hash = new HashTable(5);

hash.set("Walid", 19);

System.out.println(hash.get("Walid"));
```

The repository also contains a **Recurring Character** example using a hash table.

📖 **Documentation:** [HashTables/README.md](DataStructures/HashTables/README.md)

📖 **Custom implementation:** [HashTable_Class_Implementation.md](DataStructures/HashTables/HashTable_Class_Implementation.md)

📖 **Recurring Character:** [Recurring_Character.md](DataStructures/HashTables/Recurring_Character.md)

---

## 4. Queue

A Queue follows the **FIFO (First In, First Out)** principle.

The first element inserted is the first element removed.

### Main operations

- `enqueue()` — add an element
- `dequeue()` — remove the first element
- `peek()` — view the first element

### Example

```text
Enqueue

3 → 4 → 5 → 6 → 7 → 8
↑                   ↑
Front              Rear

Dequeue removes 3 first.
```

The repository implements a Queue using a Linked List.

📖 **Documentation:** [Queues/README.md](DataStructures/Queues/README.md)

📖 **Implementation:** [Queue_with_LinkedList_Implementation.md](DataStructures/Queues/Queue_with_LinkedList_Implementation.md)

---

## 5. Stack

A Stack follows the **LIFO (Last In, First Out)** principle.

The last element inserted is the first element removed.

### Main operations

- `push()` — add an element
- `pop()` — remove the top element
- `peek()` — view the top element

### Example

```text
Push C

Top
 ↓
 C
 B
 A

Pop → C
```

The repository contains:

- Stack using Linked List
- Stack using Array

📖 **Documentation:** [Stacks/README.md](DataStructures/Stacks/README.md)

📖 **Implementation:** [Stack_Implementation.md](DataStructures/Stacks/Stack_Implementation.md)

---

## 6. Binary Search Tree

A Binary Search Tree (BST) is a binary tree organized according to an ordering rule.

For the implementation in this repository:

```text
             9
           /   \
          4     20
         / \   /  \
        1   6 15  170
```

Values smaller than a node are placed in the left subtree, while values greater than or equal to the node are placed in the right subtree.

### Main operations

- Insert
- Search / Lookup
- Remove

### Example

```java
BinarySearchTree tree = new BinarySearchTree();

tree.insert(9);
tree.insert(4);
tree.insert(20);
tree.insert(1);
```

📖 **Documentation:** [Trees/README.md](DataStructures/Trees/README.md)

📖 **BST implementation:** [BinarySearchTree_Implementation.md](DataStructures/Trees/BinarySearchTree/BinarySearchTree_Implementation.md)

---

## 7. Graph

A Graph consists of **vertices (nodes)** connected by **edges**.

The repository uses an adjacency-list representation for its Graph implementation.

### Main concepts

- Vertex / Node
- Edge
- Degree
- Directed Graph
- Undirected Graph
- Adjacency List

### Example

```text
1 ─── 2
│     │
│     │
3 ─── 4
```

📖 **Documentation:** [Graphs/README.md](DataStructures/Graphs/README.md)

---

# ⚙️ Algorithms

Algorithms are step-by-step procedures used to solve problems or perform computations.

## 1. Breadth-First Search (BFS)

BFS explores a tree or graph **level by level**.

It uses a **Queue** to process nodes in FIFO order.

### Example

```text
          9
        /   \
       4     20
      / \   /  \
     1   6 15  170

BFS:
9 → 4 → 20 → 1 → 6 → 15 → 170
```

The repository contains:

- Iterative BFS
- Recursive BFS

📖 **Documentation:** [BFS/README.md](DataStructures/Algorithms/BFS/README.md)

📖 **Implementation:** [BreadthFirstSearch_Implementation.md](Algorithms/BFS/BreadthFirstSearch_Implementation.md)

---

## 2. Depth-First Search (DFS)

DFS explores as deeply as possible before moving to another branch.

For trees, DFS commonly appears in three traversal orders:

- Preorder
- Inorder
- Postorder

### Example

For:

```text
          9
        /   \
       4     20
      / \   /  \
     1   6 15  170
```

The traversals include:

```text
Preorder:
9 → 4 → 1 → 6 → 20 → 15 → 170

Inorder:
1 → 4 → 6 → 9 → 15 → 20 → 170

Postorder:
1 → 6 → 4 → 15 → 170 → 20 → 9
```

📖 **Documentation:** [DFS/README.md](DataStructures/Algorithms/DFS/README.md)

📖 **Implementation:** [DepthFirstSearch_Implementation.md](Algorithms/DFS/DepthFirstSearch_Implementation.md)

---

# 🔄 Sorting Algorithms

Sorting algorithms rearrange elements into a particular order, commonly ascending or descending.

This repository currently contains four sorting algorithms.

## Bubble Sort

Repeatedly compares adjacent elements and swaps them when they are in the wrong order.

```text
5  6  1  3
   ↓
5  1  6  3
      ↓
5  1  3  6
```

📖 [BubbleSort README](Algorithms/Sorting/BubbleSort/README.md)

---

## Insertion Sort

Builds the sorted portion of an array one element at a time.

```text
12 | 11 13 5 6
 ↓
11 12 | 13 5 6
```

📖 [InsertionSort README](Algorithms/Sorting/InsertionSort/README.md)

---

## Merge Sort

Uses **Divide and Conquer**:

1. Divide the array.
2. Recursively sort each half.
3. Merge the sorted halves.

```text
[70, 30, 50, 10]

       Divide
      /      \
 [70,30]   [50,10]
   /  \      /  \
 [70][30]  [50][10]

       Merge

[10,30,50,70]
```

📖 [MergeSort README](Algorithms/Sorting/MergeSort/README.md)

---

## Selection Sort

Finds the smallest element in the unsorted portion and swaps it into its correct position.

```text
64  25  12  22  11
↑               ↑
current         minimum

11  25  12  22  64
```

📖 [SelectionSort README](Algorithms/Sorting/SelectionSort/README.md)

---

# ♻️ Recursion

Recursion is a technique where a method calls itself to solve smaller versions of the same problem.

A recursive solution normally contains:

- **Base Case**
- **Recursive Case**

### Example

```java
public static int factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

For:

```text
factorial(5)

5 × factorial(4)
      ↓
4 × factorial(3)
      ↓
3 × factorial(2)
      ↓
2 × factorial(1)
      ↓
1
```

The repository also compares recursive and iterative approaches for Factorial and Fibonacci.

📖 [Recursion README](DataStructures/Algorithms/Recursion/README.md)

📖 [Recursion Implementation](Algorithms/Recursion/Recursion_Implementation.md)

---

# 📊 Complexity Reference

Big-O notation describes how the time or space requirements of an algorithm grow as the input size increases.

## Common Complexities

| Complexity | Name | Example |
|---|---|---|
| `O(1)` | Constant | Array access by index |
| `O(log n)` | Logarithmic | Balanced BST search |
| `O(n)` | Linear | Linear search / traversal |
| `O(n log n)` | Linearithmic | Merge Sort |
| `O(n²)` | Quadratic | Bubble Sort |
| `O(2ⁿ)` | Exponential | Naive recursive Fibonacci |

## Data Structure Operations

| Data Structure | Access | Search | Insert | Delete |
|---|---:|---:|---:|---:|
| Array | O(1) | O(n) | O(n) | O(n) |
| Singly Linked List | O(n) | O(n) | O(1)* | O(n) |
| Doubly Linked List | O(n) | O(n) | O(1)* | O(n) |
| Hash Table | — | O(1)** | O(1)** | O(1)** |
| Queue | — | — | O(1) | O(1) |
| Stack | — | — | O(1) | O(1) |
| BST | O(n)*** | O(n)*** | O(n)*** | O(n)*** |

\* When inserting/removing at a known end or known position/reference as supported by the implementation.

\** Average-case complexity; worst-case behavior can be O(n), depending on collisions.

\*** Average-case for a reasonably balanced BST. A highly skewed BST can degrade to O(n).

## Sorting Reference

| Algorithm | Best | Average | Worst | Extra Space |
|---|---:|---:|---:|---:|
| Bubble Sort | O(n)**** | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |

\**** The provided Bubble Sort implementation does not include an early-exit optimization, so its actual best-case time remains O(n²).

---

# 🗺️ Learning Roadmap

A practical order for studying the repository is:

```text
1. Arrays
      ↓
2. Linked Lists
      ↓
3. Stacks
      ↓
4. Queues
      ↓
5. Hash Tables
      ↓
6. Trees
      ↓
7. Binary Search Tree
      ↓
8. Graphs
      ↓
9. Recursion
      ↓
10. Searching / Traversal
      ↓
11. Sorting Algorithms
      ↓
12. More advanced Algorithms
```

### Recommended Learning Process

For each topic:

```text
Understand the concept
        ↓
Study the diagram
        ↓
Understand the implementation
        ↓
Trace the algorithm manually
        ↓
Analyze Time & Space Complexity
        ↓
Practice with a small problem
        ↓
Implement it yourself
```

---

# 🎯 Project Goals

This repository is intended to build a strong foundation in:

- Data Structures
- Algorithms
- Problem Solving
- Java Programming
- Object-Oriented Programming
- Time Complexity
- Space Complexity
- Algorithmic Thinking
- Reading and tracing code
- Implementing structures from scratch

The focus is not simply memorizing algorithms. The goal is to understand:

> **What problem does this structure or algorithm solve?**

> **How does it work internally?**

> **Why does it have this complexity?**

> **When should it be used?**

---

# 🧪 Practice Philosophy

Each implementation is treated as a learning exercise.

The repository combines:

- Java implementations
- Visual diagrams
- Topic READMEs
- Implementation documentation
- Complexity analysis
- Small practical examples

As the repository grows, additional data structures and algorithms can be added using the same learning-oriented structure.

---

# 🚀 Progress

## Data Structures

- [x] Array
- [x] Linked List
    - [x] Singly Linked List
    - [x] Doubly Linked List
- [x] Hash Table
- [x] Queue
- [x] Stack
- [x] Binary Search Tree
- [x] Graph

## Algorithms

- [x] Breadth-First Search
- [x] Depth-First Search
- [x] Bubble Sort
- [x] Insertion Sort
- [x] Merge Sort
- [x] Selection Sort
- [x] Recursion

---

# 📖 Documentation Convention

Each major section can contain:

```text
Topic/
├── README.md
├── Implementation documentation
└── Images/
```

The general `../README.md` explains the topic conceptually, while implementation-specific documentation explains the Java code and its operations.

This keeps the repository easy to navigate while connecting **theory → implementation → practice**.

---

## ⭐ Purpose

This project is a personal learning record and a practical reference for **Data Structures and Algorithms in Java**.

It is continuously developed as new concepts are studied, implemented, documented, and practiced.
