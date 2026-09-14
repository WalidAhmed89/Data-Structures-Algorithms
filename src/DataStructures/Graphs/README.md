# Graph Data Structure

A **Graph** is a non-linear data structure used to represent relationships or connections between objects.

A graph consists mainly of:

- **Vertices (Nodes)** — the objects/entities in the graph.
- **Edges** — the connections between vertices.

## 📚 What This Section Covers

- Graph terminology
- Vertices and Edges
- Directed and Undirected Graphs
- Adjacency List representation
- Adding vertices
- Adding edges
- Complexity
- The `Graph` Java implementation in this project

## 🖼️ Introduction to Graphs

The following diagram shows the two most important building blocks of a Graph: **Nodes/Vertices** and **Edges**.

![Introduction to Graphs](./introduction_to_graphs.png)

### Nodes / Vertices

The circles labeled `1`, `2`, `3`, `4`, `5`, and `6` are the **Nodes (Vertices)** of the graph.

Each node represents an entity or object.

For example, nodes could represent:

- People in a social network
- Cities on a map
- Computers in a network
- Courses in a university
- Any object that has relationships with other objects

In the image, there are **6 vertices**:

```text
Vertices = {1, 2, 3, 4, 5, 6}
```

### Edges

The lines connecting the nodes are called **Edges**.

An edge represents a relationship or connection between two vertices.

For example:

```text
1 ---- 2
```

means that vertex `1` is connected to vertex `2`.

From the image:

```text
1 ---- 3
1 ---- 2
3 ---- 5
3 ---- 4
4 ---- 2
2 ---- 6
```

These connections form the relationships between the vertices.

### How to Read the Diagram

If we look at vertex `2`:

```text
    1
    |
    2 ---- 6
   /
  4
```

Vertex `2` is connected to:

```text
{1, 4, 6}
```

Therefore, its **degree** is `3`.

Similarly, vertex `3` is connected to:

```text
{1, 4, 5}
```

so its degree is also `3`.

### Important Idea

A Graph can be thought of as:

```text
Graph = Vertices + Edges
```

The **vertices** represent the things, while the **edges** represent the relationships between those things.

## 🧠 Basic Structure

```text
      1
     / \
    2   3
     \ /
      4
```

Here, `1`, `2`, `3`, and `4` are vertices, while the lines between them are edges.

## 🔗 Important Terminology

### Vertex / Node

A **Vertex** represents an individual object in the graph.

### Edge

An **Edge** represents a connection between two vertices.

### Adjacent Vertices

Two vertices are adjacent when an edge connects them.

### Degree

The degree of a vertex is the number of edges connected to it.

---

# 📌 Types of Graphs

## Undirected Graph

An undirected edge works in both directions:

```text
1 ---- 2
```

The current `Graph` implementation represents an **undirected graph**.

## Directed Graph

A directed edge has a direction:

```text
1 ----> 2
```

The current implementation does not model directed edges.

---

# 🗃️ Graph Representation

Common graph representations include:

- Adjacency Matrix
- Adjacency List

This project uses an **Adjacency List**.

Example:

```text
1 → [2, 3]
2 → [1]
3 → [1]
```

The Java implementation uses:

```java
Hashtable<Integer, ArrayList<Integer>> adjacentList;
```

The key represents a vertex, while its `ArrayList<Integer>` contains adjacent vertices.

---

# ⚙️ Current Implementation

The project contains a `Graph` class with:

```java
int numberOfNode;
Hashtable<Integer, ArrayList<Integer>> adjacentList;
```

### `numberOfNode`

Stores the number of vertices currently registered in the graph.

### `adjacentList`

Stores the graph using an adjacency-list representation.

Conceptually:

```text
Vertex → Adjacent Vertices
```

---

# ➕ Add Vertex

The method:

```java
addVertex(int node)
```

checks whether the vertex already exists.

If it does not exist:

```java
adjacentList.put(node, new ArrayList<>());
numberOfNode++;
```

For example:

```java
graph.addVertex(1);
graph.addVertex(2);
```

creates:

```text
1 → []
2 → []
```

---

# 🔗 Add Edge

The method:

```java
addEdge(int node, int edge)
```

first checks that both vertices exist.

Then it adds both directions:

```java
adjacentList.get(node).add(edge);
adjacentList.get(edge).add(node);
```

For:

```java
addEdge(1, 2);
```

the result is:

```text
1 → [2]
2 → [1]
```

This is why the current implementation is an **undirected graph**.

---

# 🧪 Example

```java
Graph graph = new Graph();

graph.addVertex(1);
graph.addVertex(2);
graph.addVertex(3);

graph.addEdge(1, 2);
graph.addEdge(1, 3);
```

Conceptually:

```text
    1
   / \
  2   3
```

Adjacency list:

```text
1 → [2, 3]
2 → [1]
3 → [1]
```

---

# ⏱️ Complexity

For the current adjacency-list implementation:

| Operation | Typical Complexity |
|---|---:|
| Check vertex | `O(1)` average |
| Add vertex | `O(1)` average |
| Add edge | `O(1)` average |
| Get neighbors | `O(degree)` |
| Space | `O(V + E)` |

Where:

- `V` = number of vertices
- `E` = number of edges

Because this is an undirected graph, each edge is stored in both vertices' adjacency lists.

---

# ⚠️ Current Limitations

The current class focuses on the basic Graph structure.

It does not currently implement:

- Edge removal
- Vertex removal
- BFS
- DFS
- Directed edges
- Weighted edges
- Shortest paths
- Duplicate-edge prevention
- Graph searching

These can be added as future exercises.

---

# 🌳 Graph vs Tree

A Tree is a restricted type of graph.

A general graph can contain cycles:

```text
1 ---- 2
|      |
|      |
4 ---- 3
```

A typical tree does not contain cycles.

---

# 🎯 Learning Goals

After studying this section, you should understand:

- What a Graph is
- Vertices and Edges
- Directed vs. Undirected graphs
- Adjacency Lists
- How vertices are added
- How edges are added
- How graph data is stored
- Basic graph complexity

The current implementation provides the foundation for graph algorithms such as **BFS** and **DFS**.

## 📂 Implementation

- [Graph Class Implementation](./Graph_Class_Implementation.md)
