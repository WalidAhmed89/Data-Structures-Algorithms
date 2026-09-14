# Graph Class Implementation

## 📌 Overview

This document explains the `Graph` class implemented in the project.

The implementation uses an **Adjacency List** and represents an **undirected graph**.

## 💻 Implementation

```java
package DataStructures.Graphs;

import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
    int numberOfNode;
    Hashtable<Integer, ArrayList<Integer>> adjacentList;

    public Graph(){
        this.numberOfNode = 0;
        this.adjacentList = new Hashtable<>();
    }

    public void addVertex(int node){
        if(!adjacentList.containsKey(node)){
            adjacentList.put(node,new ArrayList<>());
            numberOfNode++;
        }
    }

    public void addEdge(int node, int edge){
        if(adjacentList.containsKey(node)  && adjacentList.containsKey(edge)) {
            this.adjacentList.get(node).add(edge);
            this.adjacentList.get(edge).add(node);
        }
    }
}
```

---

# 🧱 Fields

## `numberOfNode`

```java
int numberOfNode;
```

Stores the number of vertices currently added to the graph.

It starts at `0` and increases when a new vertex is added.

## `adjacentList`

```java
Hashtable<Integer, ArrayList<Integer>> adjacentList;
```

Stores the graph using an adjacency list.

Conceptually:

```text
Vertex → Connected Vertices
```

For example:

```text
1 → [2, 3]
2 → [1]
3 → [1]
```

---

# 🏗️ Constructor

```java
public Graph(){
    this.numberOfNode = 0;
    this.adjacentList = new Hashtable<>();
}
```

The constructor creates an empty graph:

```text
numberOfNode = 0
adjacentList = {}
```

---

# ➕ `addVertex`

```java
public void addVertex(int node){
    if(!adjacentList.containsKey(node)){
        adjacentList.put(node,new ArrayList<>());
        numberOfNode++;
    }
}
```

### Step 1 — Check if the vertex exists

```java
adjacentList.containsKey(node)
```

If the vertex already exists, nothing is added.

### Step 2 — Create its adjacency list

```java
adjacentList.put(node, new ArrayList<>());
```

The new vertex starts with no connections.

### Step 3 — Increase the vertex count

```java
numberOfNode++;
```

Example:

```java
graph.addVertex(1);
graph.addVertex(2);
```

Result:

```text
1 → []
2 → []
```

and:

```text
numberOfNode = 2
```

---

# 🔗 `addEdge`

```java
public void addEdge(int node, int edge){
    if(adjacentList.containsKey(node) &&
       adjacentList.containsKey(edge)) {

        adjacentList.get(node).add(edge);
        adjacentList.get(edge).add(node);
    }
}
```

The method connects two existing vertices.

Both vertices must already exist.

For:

```java
graph.addVertex(1);
graph.addVertex(2);
graph.addEdge(1, 2);
```

the adjacency list becomes:

```text
1 → [2]
2 → [1]
```

---

# 🔄 Why Are Both Directions Added?

The implementation contains:

```java
adjacentList.get(node).add(edge);
adjacentList.get(edge).add(node);
```

Therefore:

```text
1 → 2
```

is stored as:

```text
1 → [2]
2 → [1]
```

This represents an **undirected edge**.

---

# 🧪 Complete Example

```java
Graph graph = new Graph();

graph.addVertex(1);
graph.addVertex(2);
graph.addVertex(3);

graph.addEdge(1, 2);
graph.addEdge(1, 3);
```

Graph:

```text
    1
   / \
  2   3
```

Adjacency List:

```text
1 → [2, 3]
2 → [1]
3 → [1]
```

---

# ⏱️ Complexity

| Operation | Typical Complexity |
|---|---:|
| Check vertex | `O(1)` average |
| Add vertex | `O(1)` average |
| Add edge | `O(1)` average |
| Get neighbors | `O(degree)` |
| Space | `O(V + E)` |

The adjacency lists store both directions of each undirected edge.

---

# 🎯 What This Example Teaches

This class demonstrates the basic building blocks of a Graph:

```text
Graph
  ↓
Vertices
  ↓
Adjacency List
  ↓
Edges
```

It provides the foundation for implementing future graph operations and algorithms such as:

- BFS
- DFS
- Searching
- Edge removal
- Directed Graphs
- Weighted Graphs
- Shortest Path algorithms
