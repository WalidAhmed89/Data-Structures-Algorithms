# Recursion — Java Implementation

This document explains the provided `Recursion` class.

Package:

```java
package DataStructures.Algorithms.Recursion;
```

The class contains:

```text
findFactorialRecursive()
findFactorialIterative()
fibonacciIterative()
fibonacciRecursive()
```

![Recursive Method Call](Images/recursion_method_call.png)

## 1. Recursive Factorial

```java
public static int findFactorialRecursive(int num)
```

Factorial is:

```text
n! = n × (n - 1) × ... × 1
```

Example:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

The implementation first rejects negative input:

```java
if (num < 0) {
    throw new IllegalArgumentException(
        "Factorial is undefined for negative numbers"
    );
}
```

Its base case is:

```java
if (num == 1 || num == 0) {
    return 1;
}
```

The recursive case is:

```java
return num * findFactorialRecursive(num - 1);
```

For `5`:

```text
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

Then the results return:

```text
1
2
6
24
120
```

Complexity:

```text
Time:  O(n)
Space: O(n)
```

![Recursion Base Case](Images/recursion_base_case.png)

## 2. Iterative Factorial

```java
public static int findFactorialIterative(int num)
```

This version uses a loop:

```java
int answer = 1;

for (int i = 2; i <= num; i++) {
    answer = answer * i;
}
```

For `5`:

```text
1 → 2 → 6 → 24 → 120
```

Complexity:

```text
Time:  O(n)
Space: O(1)
```

## 3. Iterative Fibonacci

```java
public static int fibonacciIterative(int n)
```

The implementation starts with:

```java
List.of(0, 1)
```

and calculates each next value from the previous two:

```java
arr.add(arr.get(i - 1) + arr.get(i - 2));
```

The sequence is:

```text
0, 1, 1, 2, 3, 5, 8, 13, ...
```

For:

```java
fibonacciIterative(6)
```

the result is:

```text
8
```

Complexity for this implementation:

```text
Time:  O(n)
Space: O(n)
```

The `ArrayList` stores the generated values.

## 4. Recursive Fibonacci

```java
public static int fibonacciRecursive(int n)
```

The base cases are handled by:

```java
if (n < 2) {
    return n;
}
```

Therefore:

```text
F(0) = 0
F(1) = 1
```

The recursive case is:

```java
return fibonacciRecursive(n - 1)
     + fibonacciRecursive(n - 2);
```

Conceptually:

```text
                 F(5)
               /      \
            F(4)      F(3)
           /   \      /   \
        F(3) F(2)  F(2) F(1)
        ...
```

The same Fibonacci values can be calculated repeatedly, which causes the exponential runtime.

Complexity:

```text
Time:  O(2^n)
Space: O(n)
```

## Comparison

| Problem | Version | Time | Extra Space |
|---|---|---:|---:|
| Factorial | Recursive | O(n) | O(n) |
| Factorial | Iterative | O(n) | O(1) |
| Fibonacci | Recursive | O(2^n) | O(n) |
| Fibonacci | Iterative | O(n) | O(n) |

## Main Method

The provided `main` tests:

```java
findFactorialRecursive(5)
findFactorialIterative(5)

fibonacciRecursive(6)
fibonacciRecursive(8)
fibonacciRecursive(12)
```

Expected values:

```text
120
120
8
21
144
```

## Important Implementation Notes

### Negative Factorial Input

The recursive factorial method throws an exception for negative numbers.

The iterative factorial method does not perform the same validation; for a negative input its loop does not execute and `1` is returned.

### Integer Overflow

All methods return `int`. Large factorial or Fibonacci values can exceed the range of Java's `int` type and overflow.

### Iterative Fibonacci Storage

The iterative Fibonacci implementation stores the whole generated sequence in an `ArrayList`, which gives it `O(n)` extra space.

## Key Concepts

```text
Recursion
├── Base Case
├── Recursive Case
├── Call Stack
│
├── Factorial
│   ├── Recursive
│   └── Iterative
│
└── Fibonacci
    ├── Recursive
    └── Iterative
```
