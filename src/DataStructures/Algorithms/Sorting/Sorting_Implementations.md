# Sorting Implementations

This document explains the Java implementations provided in the Sorting section.

The section contains four classes:

```text
Bubble_Sort
Insertion_Sort
Merge_Sort
Selection_Sort
```

The implementations sort integer arrays in **ascending order**.

---

# 1. Bubble Sort Implementation

## Class

```java
public class Bubble_Sort
```

The class provides two implementations:

```java
bubbleSort_Iterator(int[] array)
bubbleSort_Recursion(int[] array, int n)
```

![Bubble Sort](Images/bubble_sort.png)

## Iterative Bubble Sort

```java
public static void bubbleSort_Iterator(int[] array)
```

The outer loop controls the number of passes:

```java
for (int i = 0; i < array.length - 1; i++)
```

The inner loop compares adjacent elements:

```java
for (int j = 0; j < array.length - 1 - i; j++)
```

The condition:

```java
if (array[j] > array[j + 1])
```

checks whether two adjacent values are in the wrong order.

If they are, the values are swapped:

```java
int temp = array[j];
array[j] = array[j + 1];
array[j + 1] = temp;
```

### Why `array.length - 1 - i`?

After each complete pass, one of the largest remaining elements reaches its final position at the end.

Therefore, the next pass does not need to compare that already-sorted part.

## Recursive Bubble Sort

```java
public static void bubbleSort_Recursion(int[] array, int n)
```

Base case:

```java
if (n <= 1) return;
```

One pass is performed:

```java
for (int i = 0; i < n - 1; i++)
```

Then the algorithm recursively sorts the remaining portion:

```java
bubbleSort_Recursion(array, n - 1);
```

Conceptually:

```text
Perform one Bubble Sort pass
↓
Largest remaining element is placed
↓
Reduce the unsorted size
↓
Repeat recursively
```

## Complexity

For the provided implementation:

```text
Time: O(n²)
```

The iterative version uses:

```text
Extra Space: O(1)
```

The recursive version additionally uses the recursion call stack.

---

# 2. Insertion Sort Implementation

## Class

```java
public class Insertion_Sort
```

The class provides:

```java
insertionSort(int[] array)
```

![Insertion Sort](Images/insertion_sort.png)

## Main Loop

```java
for (int i = 1; i < array.length; i++)
```

The algorithm starts at index `1` because the first element is considered the initial sorted portion.

The current value is saved:

```java
int current = array[i];
```

The previous index is stored:

```java
int j = i - 1;
```

## Shifting Elements

```java
while (j >= 0 && array[j] > current)
```

While an element is larger than `current`, it is shifted one position to the right:

```java
array[j + 1] = array[j];
j--;
```

After the correct position is found:

```java
array[j + 1] = current;
```

## Conceptual Structure

```text
Sorted portion | Unsorted portion
```

For example:

```text
[11, 12, 13] | [5, 6]
```

The algorithm takes `5`, shifts larger values, and inserts it:

```text
[5, 11, 12, 13] | [6]
```

## Complexity

Typical complexity:

```text
Best:  O(n)
Average: O(n²)
Worst: O(n²)
```

Extra space:

```text
O(1)
```

---

# 3. Merge Sort Implementation

## Class

```java
public class Merge_Sort
```

The class provides:

```java
mergeSort(int[] array, int left, int right)
merge(int[] array, int left, int mid, int right)
```

![Merge Sort](Images/merge_sort.png)

## Divide Step

```java
public static void mergeSort(
    int[] array,
    int left,
    int right
)
```

Base case:

```java
if (left >= right) {
    return;
}
```

If the section contains zero or one element, it is already sorted.

The middle index is calculated:

```java
int mid = (left + right) / 2;
```

The array is recursively divided:

```java
mergeSort(array, left, mid);
mergeSort(array, mid + 1, right);
```

Then the two sorted sections are merged:

```java
merge(array, left, mid, right);
```

## Merge Step

A temporary array is created:

```java
int[] temp = new int[right - left + 1];
```

Two pointers are used:

```java
int i = left;
int j = mid + 1;
```

`i` points to the left sorted section and `j` points to the right sorted section.

The smaller value is repeatedly copied into `temp`:

```java
if (array[i] <= array[j]) {
    temp[k++] = array[i++];
} else {
    temp[k++] = array[j++];
}
```

When one side is exhausted, the remaining values from the other side are copied.

Finally, the temporary values are copied back:

```java
array[left + x] = temp[x];
```

## Complexity

```text
Time: O(n log n)
Extra Space: O(n)
```

The `O(n)` extra space comes from the temporary array used during merging.

---

# 4. Selection Sort Implementation

## Class

```java
public class Selection_Sort
```

The class provides:

```java
selectionSort_Iterator(int[] array)
selectionSort_Recursion(int[] array)
selectionSort_Recursion(int[] array, int start)
```

![Selection Sort](Images/selection_sort.png)

## Iterative Selection Sort

The current position starts at `i`:

```java
int smallestIndex = i;
```

The inner loop searches for the smallest element:

```java
for (int j = i + 1; j < array.length; j++)
```

When a smaller element is found:

```java
if (array[j] < array[smallestIndex]) {
    smallestIndex = j;
}
```

After searching the unsorted section, the smallest value is swapped with the current position.

```text
Find minimum
↓
Swap with current position
↓
Move to next position
```

## Recursive Selection Sort

The public method:

```java
public static void selectionSort_Recursion(int[] array)
```

starts recursion from index `0`:

```java
selectionSort_Recursion(array, 0);
```

The recursive method receives the starting position:

```java
public static void selectionSort_Recursion(
    int[] array,
    int start
)
```

Base case:

```java
if (start >= array.length - 1) return;
```

It finds the smallest element from `start` to the end, swaps it into position, and recursively continues:

```java
selectionSort_Recursion(array, start + 1);
```

## Complexity

```text
Time: O(n²)
Extra Space: O(1) iterative
```

The recursive implementation additionally uses the recursion stack.

---

# Overall Complexity Comparison

| Algorithm | Best | Average | Worst | Extra Space |
|---|---:|---:|---:|---:|
| Bubble Sort | O(n²) in this implementation | O(n²) | O(n²) | O(1) iterative |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) iterative |

## Important Implementation Notes

### Bubble Sort

The provided Bubble Sort does not use an early-exit flag such as:

```java
boolean swapped
```

Therefore, even an already sorted array still goes through the full set of passes.

### Insertion Sort

The implementation sorts the array **in-place** by shifting elements rather than creating another array.

### Merge Sort

The implementation uses a temporary array during every merge operation.

### Selection Sort

The algorithm searches the remaining unsorted portion for the smallest element and then performs one swap per outer iteration.

## Java Test Data

The implementations use arrays such as:

```java
int[] nums = {
    99, 44, 6, 2, 1,
    5, 63, 87, 283, 4, 0
};
```

After sorting in ascending order:

```text
[0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283]
```

## Learning Focus

These implementations demonstrate several important algorithmic techniques:

```text
Bubble Sort
    → Repeated adjacent comparisons and swaps

Insertion Sort
    → Shifting and insertion into a sorted portion

Merge Sort
    → Divide and Conquer + merging

Selection Sort
    → Searching for a minimum + swapping
```
