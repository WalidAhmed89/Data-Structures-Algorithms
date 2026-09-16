# Sorting Algorithms

Sorting is the process of arranging elements in a specific order, usually **ascending** or **descending**.

Sorting is one of the fundamental topics in Data Structures & Algorithms because ordered data can make searching, comparison, and further processing easier.

This section contains Java implementations of:

- Bubble Sort
- Insertion Sort
- Merge Sort
- Selection Sort

## Why Sorting Matters

Consider an unsorted array:

```text
[5, 2, 8, 1, 3]
```

After sorting in ascending order:

```text
[1, 2, 3, 5, 8]
```

The sorted structure is easier to process and can enable algorithms such as Binary Search.

## Important Sorting Concepts

### Ascending Order

Smallest to largest:

```text
1 → 2 → 3 → 4 → 5
```

### Descending Order

Largest to smallest:

```text
5 → 4 → 3 → 2 → 1
```

## Algorithms in This Section

| Algorithm | Main Idea | Average Time | Worst Time | Extra Space |
|---|---|---:|---:|---:|
| Bubble Sort | Repeatedly swap adjacent elements | O(n²) | O(n²) | O(1) iterative |
| Insertion Sort | Insert each element into the sorted portion | O(n²) | O(n²) | O(1) |
| Merge Sort | Divide, sort, and merge | O(n log n) | O(n log n) | O(n) |
| Selection Sort | Repeatedly select the smallest element | O(n²) | O(n²) | O(1) |

The exact implementation details and recursive versions are documented in the implementation README.

---

# 1. Bubble Sort

Bubble Sort repeatedly compares adjacent elements.

If they are in the wrong order, they are swapped.

![Bubble Sort](Images/bubble_sort.png)

For ascending order:

```text
if array[j] > array[j + 1]
    swap
```

After each pass, a large element moves toward the end of the unsorted portion.

Example:

```text
[5, 6, 1, 3]
```

After the first pass:

```text
[5, 1, 3, 6]
```

The largest element, `6`, has reached its correct position.

### Characteristics

- Simple to understand.
- Works in-place.
- Uses adjacent swaps.
- The provided implementation has iterative and recursive versions.

---

# 2. Insertion Sort

Insertion Sort divides the array conceptually into:

```text
Sorted | Unsorted
```

It takes the next element from the unsorted part and inserts it into the correct position in the sorted part.

![Insertion Sort](Images/insertion_sort.png)

Example:

```text
[12, 11, 13, 5, 6]
```

Take `11`:

```text
[12] | [11, 13, 5, 6]
```

Move `12` to the right:

```text
[12, 12] | [13, 5, 6]
```

Insert `11`:

```text
[11, 12] | [13, 5, 6]
```

### Characteristics

- Simple and in-place.
- Works by shifting elements.
- Particularly useful when the array is already or nearly sorted.
- The provided implementation uses an iterative approach.

---

# 3. Merge Sort

Merge Sort uses **Divide and Conquer**.

The algorithm:

```text
1. Divide the array into smaller parts.
2. Recursively sort the parts.
3. Merge the sorted parts.
```

![Merge Sort](Images/merge_sort.png)

Example:

```text
[70, 30, 50, 10]
```

Divide:

```text
[70, 30]    [50, 10]
```

Divide again:

```text
[70] [30]    [50] [10]
```

Merge sorted parts:

```text
[30, 70]    [10, 50]
```

Final merge:

```text
[10, 30, 50, 70]
```

### Characteristics

- Uses Divide and Conquer.
- Time complexity is O(n log n).
- Requires additional temporary space in this implementation.
- Naturally implemented with recursion.

---

# 4. Selection Sort

Selection Sort repeatedly finds the smallest element in the unsorted portion and places it at the beginning of that portion.

![Selection Sort](Images/selection_sort.png)

Example:

```text
[64, 25, 12, 22, 11]
```

Find the smallest value:

```text
11
```

Swap it with the first element:

```text
[11, 25, 12, 22, 64]
```

Then repeat for the remaining unsorted section.

### Characteristics

- Simple to understand.
- Uses in-place swapping.
- Performs a search for the smallest element during every pass.
- The provided implementation contains iterative and recursive versions.

---

# Comparison

| Algorithm | Strategy | In-Place | Recursive Version in This Section |
|---|---|---|---|
| Bubble Sort | Adjacent swaps | Yes | Yes |
| Insertion Sort | Shift and insert | Yes | No |
| Merge Sort | Divide and Conquer | No | Yes |
| Selection Sort | Find minimum and swap | Yes | Yes |

## Choosing a Sorting Algorithm

The choice depends on the requirements of the problem.

For learning basic sorting mechanics:

```text
Bubble Sort
Insertion Sort
Selection Sort
```

are useful because their operations are straightforward.

For learning an efficient general comparison-based sorting strategy:

```text
Merge Sort
```

introduces the important **Divide and Conquer** technique.

## Learning Goals

By studying this section, you should understand:

- What sorting means.
- Ascending and descending order.
- Bubble Sort.
- Insertion Sort.
- Merge Sort.
- Selection Sort.
- Iterative sorting.
- Recursive sorting.
- Divide and Conquer.
- Time and space complexity.
- The differences between common sorting strategies.
