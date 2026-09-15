# Recurring Character

## Overview

This example demonstrates a practical use of a Hash Table: finding the first recurring value in an integer array.

The implementation uses Java's built-in:

```java
Hashtable<Integer, Boolean>
```

## Implementation

```java
public static int recurring(int[] nums) {

    Hashtable<Integer, Boolean> seen = new Hashtable<>();

    for (int num : nums) {

        if (seen.containsKey(num)) {
            return num;
        }

        seen.put(num, true);
    }

    return -1;
}
```

## How It Works

For every number:

1. Check whether it already exists in `seen`.
2. If it exists, return that number.
3. Otherwise store it.
4. Continue to the next number.
5. Return `-1` if no recurring value exists.

## Example

Input:

```java
int[] nums = {2, 5, 1, 2, 3, 5, 1, 2, 4};
```

Processing:

```text
2 → not seen → store
5 → not seen → store
1 → not seen → store
2 → already seen → return 2
```

Output:

```text
2
```

## Why Use a Hash Table?

The important question is:

```text
"Have I seen this value before?"
```

A Hash Table provides an efficient way to perform this lookup.

Without a Hash Table, repeatedly searching previous elements would make the solution less efficient.

## Complexity

| Resource | Complexity |
|---|---:|
| Time | `O(n)` average |
| Space | `O(n)` |

Each array element is processed once, while `containsKey()` provides average constant-time lookup.

## Learning Goal

This example shows how Hash Tables can be used as an auxiliary data structure to solve algorithmic problems involving:

- Duplicate detection
- Previously seen values
- Fast membership checking
