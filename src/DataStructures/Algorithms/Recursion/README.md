# Recursion

Recursion is a programming technique where a method **calls itself** to solve a problem by reducing it into smaller versions of the same problem.

A recursive solution normally contains two essential parts:

1. **Base Case** — stops the recursion.
2. **Recursive Case** — calls the same method with a smaller or simpler input.

![Recursive Method Call](Images/recursion_method_call.png)

## How Recursion Works

A recursive method can be viewed as:

```text
Method Call
    ↓
Recursive Call
    ↓
Recursive Call
    ↓
...
    ↓
Base Case
    ↓
Return
```

Without a base case, recursive calls continue until Java eventually throws a `StackOverflowError`.

## Base Case

The base case is the condition that terminates the recursive process.

Example:

```java
public int sum(int x) {
    if (x == 1) {
        return 1;
    }

    return x + sum(x - 1);
}
```

When `x` reaches `1`, the method returns instead of calling itself again.

![Recursion Base Case](Images/recursion_base_case.png)

## Recursive Case

The recursive case calls the same method with a smaller or simpler input.

For:

```text
sum(5)
```

the calls conceptually become:

```text
sum(5)
→ 5 + sum(4)
→ 5 + 4 + sum(3)
→ 5 + 4 + 3 + sum(2)
→ 5 + 4 + 3 + 2 + sum(1)
```

Then the results return:

```text
1 → 3 → 6 → 10 → 15
```

Therefore:

```text
sum(5) = 15
```

## Call Stack

Every method call is stored in the **call stack** until it finishes.

For:

```text
factorial(4)
```

the stack grows conceptually as:

```text
factorial(4)
    ↓
factorial(3)
    ↓
factorial(2)
    ↓
factorial(1)
```

After reaching the base case, the calls return in reverse order.

This is why recursive algorithms consume stack memory.

## Recursion vs Iteration

The same problem can often be solved with either recursion or a loop.

Recursive:

```java
public static int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
}
```

Iterative:

```java
public static int factorial(int n) {
    int result = 1;

    for (int i = 2; i <= n; i++) {
        result *= i;
    }

    return result;
}
```

The recursive version uses call-stack frames. The iterative version uses a loop and does not create recursive frames.

## Advantages

- Can express some problems naturally.
- Useful for hierarchical structures such as trees.
- Common in Divide and Conquer algorithms.
- Useful for DFS and backtracking.

## Disadvantages

- Recursive calls consume stack memory.
- Deep recursion can cause `StackOverflowError`.
- Some recursive algorithms perform repeated work.
- An iterative solution may use less memory.

## Complexity

Recursion itself does not have one fixed Big-O complexity. Complexity depends on the number and structure of recursive calls.

Examples:

```text
Factorial recursion:
Time  = O(n)
Space = O(n)

Naive recursive Fibonacci:
Time  = O(2^n)
Space = O(n)
```

## This Section

The Java implementation demonstrates:

```text
Factorial
├── Recursive
└── Iterative

Fibonacci
├── Recursive
└── Iterative
```

## Learning Goals

- Understand recursion.
- Identify base and recursive cases.
- Understand the call stack.
- Compare recursion and iteration.
- Analyze recursive algorithms.
- Understand recursive Factorial and Fibonacci.
