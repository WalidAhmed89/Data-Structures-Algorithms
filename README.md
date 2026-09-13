# Data Structures & Algorithms in Java

A practical Java repository for learning, implementing, and practicing **Data Structures and Algorithms (DSA)**.

The project focuses on understanding how common data structures work internally, how algorithms operate on them, and how these concepts can be applied to programming and interview problems.

---

## 📚 What This Repository Covers

- Arrays
- Linked Lists
- Stacks
- Queues
- Hash Tables
- Trees
- Graphs
- Sorting Algorithms
- Searching and Traversal Algorithms
- Recursion
- Interview Problems

Each topic is organized separately so it can be studied and implemented independently.

---

## 🎯 Purpose

The main goal of this project is to build a strong understanding of **Data Structures and Algorithms using Java**.

Rather than relying only on Java's built-in data structures, the project includes implementations from scratch to understand:

- How data is stored
- How elements are accessed
- How insertion and deletion work
- How elements are connected
- How algorithms process data
- How time and space complexity affect performance
- How DSA concepts are applied to real problems

This is primarily a **learning and practice repository**.

---

## 🧠 Learning Approach

For each topic, the goal is to understand:

### 1. Concept

What the data structure or algorithm is and what problem it solves.

### 2. Implementation

How it can be implemented in Java and how the logic works internally.

### 3. Complexity

The time and space complexity of its important operations.

This approach helps move from simply knowing a data structure to understanding **when and why to use it**.

---

# 🗂️ Data Structures

## 1. Arrays

Arrays provide indexed storage for elements.

Topics include:

- Basic Arrays
- Array operations
- Building an Array from scratch
- Reversing Arrays
- Sorted Arrays

Important concepts:

- Indexing
- Access
- Insertion
- Deletion
- Searching
- Traversal

---

## 2. Linked List

Linked Lists store elements using nodes connected through references.

Topics include:

- Nodes
- Singly Linked Lists
- Doubly Linked Lists
- Traversal
- Insertion
- Deletion

Important concepts:

- Head
- Tail
- Node references
- Sequential traversal
- Dynamic structure

---

## 3. Stack

A Stack follows the **LIFO (Last In, First Out)** principle.

Topics include:

- Push
- Pop
- Peek
- Stack using an Array
- Stack using a Linked List

Common applications:

- Function call stack
- Undo operations
- Expression evaluation
- Backtracking

---

## 4. Queue

A Queue follows the **FIFO (First In, First Out)** principle.

Topics include:

- Enqueue
- Dequeue
- Front
- Rear
- Queue using a Linked List

Common applications:

- Scheduling
- Task processing
- Breadth-First Search
- Request handling

---

## 5. Hash Table

Hash Tables store data using **key-value relationships** and hash functions.

Topics include:

- Hashing
- Keys and Values
- Hash Functions
- Collision handling
- Searching
- Insertion
- Deletion
- Recurring Character problem

The main idea is to convert a key into an index through a hash function to provide fast lookup.

---

## 6. Trees

Trees represent hierarchical relationships between elements.

The project focuses on **Binary Search Trees (BST)**.

Topics include:

- Tree Nodes
- Root
- Parent and Child
- Leaf
- Binary Search Tree
- Insertion
- Searching
- Traversal

Typical BST property:

```text
Left Subtree < Node < Right Subtree
```

---

## 7. Graphs

Graphs represent relationships between connected elements.

Main concepts include:

- Vertices
- Edges
- Graph representation
- Graph traversal

Graphs can model:

- Networks
- Maps
- Social connections
- Dependencies

---

# ⚙️ Algorithms

## 8. Sorting Algorithms

The repository includes implementations such as:

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort

For each algorithm, the goal is to understand:

- How it works
- The steps it performs
- Time complexity
- Space complexity
- When it is useful

---

## 9. Breadth-First Search (BFS)

BFS explores data **level by level**.

It commonly uses a **Queue** to process the next elements.

```text
Start
  ↓
Visit current element
  ↓
Add its neighbors
  ↓
Process the next element
  ↓
Continue level by level
```

BFS is commonly used for tree and graph traversal.

---

## 10. Depth-First Search (DFS)

DFS explores as deeply as possible before backtracking.

It can be implemented using:

- Recursion
- A Stack

```text
Start
  ↓
Visit current element
  ↓
Go deeper
  ↓
Continue until no path remains
  ↓
Backtrack
```

DFS is commonly used with trees, graphs, and recursive problem solving.

---

## 11. Recursion

Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

A recursive solution normally contains:

### Base Case

The condition that stops the recursion.

### Recursive Case

The part that reduces the problem and calls the method again.

Recursion is important for:

- Tree traversal
- DFS
- Divide-and-conquer algorithms
- Backtracking
- Recursive problem solving

---

# 💻 Interview Problems

The repository also contains programming and interview-oriented problems.

The purpose of this section is to apply the data structures and algorithms learned throughout the project to actual problem-solving scenarios.

For each problem, the focus is on:

- Understanding the problem
- Choosing the appropriate data structure
- Choosing an efficient algorithm
- Implementing the solution
- Analyzing time complexity
- Analyzing space complexity

---

# 📊 Complexity

Common complexities encountered throughout the project:

| Complexity | Meaning |
|---|---|
| `O(1)` | Constant time |
| `O(log n)` | Logarithmic time |
| `O(n)` | Linear time |
| `O(n log n)` | Linearithmic time |
| `O(n²)` | Quadratic time |

Complexity analysis helps compare different approaches and understand how solutions behave as input size grows.

---

# 🏗️ Project Structure

The repository is organized by topic:

```text
DataStructures/
│
├── Arrays/
├── LinkedList/
├── Stack/
├── Queue/
├── HashTable/
├── Trees/
├── Graphs/
│
├── Sorting/
├── Searching/
├── Recursion/
│
└── Interview/
```

The exact package and class organization may vary between topics depending on the implementation.

---

# 📝 Documentation

Each major topic is intended to have its own `README.md` explaining:

- What the concept is
- Why it is used
- How it works
- How it is implemented in Java
- Important operations
- Time complexity
- Space complexity
- Examples

The repository-level README provides the overall roadmap, while topic-level README files provide deeper explanations for individual implementations.

---

# 🔍 What I Practice Through This Project

This project also helps practice:

- Object-Oriented Programming
- Java classes and objects
- Encapsulation
- Interfaces
- References
- Generics
- Collections
- Recursion
- Algorithm design
- Complexity analysis
- Problem solving
- Debugging
- Clean and understandable Java code

---

# 🎓 Learning Goals

By completing this project, the main goals are to be able to:

- Understand common data structures
- Implement data structures from scratch
- Understand how common algorithms work internally
- Select an appropriate data structure for a problem
- Analyze time and space complexity
- Solve common programming problems
- Explain DSA concepts clearly
- Recognize trade-offs between different approaches

---

# 📌 Important Principle

> **Data Structures and Algorithms are tools for solving problems, not solutions to memorize.**

The important process is:

```text
What problem am I solving?
        ↓
What data do I have?
        ↓
Which data structure fits?
        ↓
Which algorithm fits?
        ↓
What is the complexity?
        ↓
Can the solution be improved?
```

---

# 🚀 Project Status

```text
Data Structures      → Completed
Algorithms            → Completed
Interview Practice    → Ongoing
Documentation         → Continuously Improving
```

The implementations may continue to be refined as new concepts are learned and existing solutions are reviewed.

---

# 👤 Author

**Walid Ahmed**

Java Backend Developer in Progress

This repository represents my practice and continuous learning journey in **Data Structures, Algorithms, and Java**.
