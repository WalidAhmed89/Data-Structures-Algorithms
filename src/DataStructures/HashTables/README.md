# Hash Table

A **Hash Table** is a data structure that stores data as **key-value pairs**. A hash function converts a key into an array index, allowing efficient insertion and lookup.

## Core Idea

```text
Key → Hash Function → Array Index → Value
```

Example:

```text
"Walid" → hash("Walid") → 2 → 19
```

## Main Concepts

### Key-Value Pair

```text
"Name"  → "Walid"
"Age"   → 19
"Magic" → true
```

The custom implementation stores each pair inside a `Node`.

### Hash Function

The project uses:

```java
private int hash(String Key) {
    int hash = 0;
    for (int i = 0; i < Key.length(); i++) {
        hash = (hash + Key.charAt(i) * i) % this.data.length;
    }
    return hash;
}
```

The modulo operation keeps the result inside the array boundaries.

### Adjacency / Internal Storage

The custom table uses:

```java
Node[] data;
```

Each position can contain a `Node` holding a key and value.

## Custom `HashTable`

The class provides:

- `HashTable(int size)` — creates the internal array.
- `set(String key, Object value)` — hashes the key and stores a `Node`.
- `get(String key)` — hashes the key, checks the stored key, and returns its value.
- `keys()` — attempts to print stored keys.

## Collision

A collision happens when different keys produce the same index:

```text
Key A ──┐
        ├──→ index 2
Key B ──┘
```

The current implementation **does not handle collisions**. `set()` simply replaces the node at that index.

Common collision strategies in complete Hash Tables include:

- Separate Chaining
- Open Addressing
- Linear Probing
- Quadratic Probing

## Recurring Character Example

`Recurring_Character` uses Java's built-in:

```java
Hashtable<Integer, Boolean>
```

to find the first recurring number.

For:

```java
{2, 5, 1, 2, 3, 5, 1, 2, 4}
```

the result is:

```text
2
```

The algorithm stores every value it has seen and checks `containsKey()` before storing the next value.

## Complexity

For a typical Hash Table with good hashing and collision handling:

| Operation | Average | Worst Case |
|---|---:|---:|
| Insert | `O(1)` | `O(n)` |
| Search | `O(1)` | `O(n)` |
| Delete | `O(1)` | `O(n)` |

For the recurring-character algorithm:

```text
Time:  O(n) average
Space: O(n)
```

## Current Limitations

The custom implementation is educational and currently has no:

- Collision handling
- Resizing
- Delete operation
- Proper empty-slot handling in `keys()`

The `Node` fields are also typed as `Object`, while `set()` and `get()` specifically accept `String` keys.

## Learning Goals

- Understand key-value storage.
- Understand hashing and array indexing.
- Understand collisions.
- Implement a basic Hash Table.
- Use a Hash Table to solve a duplicate/recurring-value problem.

## Documentation

- [HashTable Class Implementation](./HashTable_Class_Implementation.md)
- [Recurring Character Example](./Recurring_Character.md)
