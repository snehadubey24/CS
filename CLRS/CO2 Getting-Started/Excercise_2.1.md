# Excercise 2.1

---

### 1. Using Figure 2.2 as a model, illustrate the operation of INSERTION-SORT on the array A = {31,41,59,26,41,58}.

`Answer` :

![](https://i.ibb.co/Fz2w4KL/my-basic-app.png)

### 2. Rewrite the INSERTION-SORT procedure to sort into nonincreasing instead of nondecreasing order.

`Answer` :

```cpp
    for j = 2 to A.length
    key = A[j]
    // Insert A[j] into the sorted sequence A[1..j − 1]
    i = j − 1
    while i > 0 and A[i] < key
        A[i + 1] = A[i]
        i = i − 1
    A[i + 1] = key
```

### 3. Consider the searching problem:

### Input: A sequence of n numbers A = {a1,a2,....,aN} and a value .

### Output: An index i such that v = A[i] or the special value NIL if does not appear in A.

### Write pseudocode for linear search, which scans through the sequence, looking for . Using a loop invariant, prove that your algorithm is correct. Make sure that your loop invariant fulfills the three necessary properties.

`Answer` :

```cpp
Linear-Search(A,v):

for i = 1 to A.length
    if A[i] == v
        return i

return NIL
```

```
Initialization : Initially the subarray is empty. So, none of its’ elements are equal to v.


Maintenance : In i-th iteration, we check whether A[i] is equal to v or not. If yes, we terminate the loop or we continue the iteration. So, if the subarray A[1..i−1] did not contain v before the i-th iteration, the subarray A[1..i] will not contain v before the next iteration (unless i-th iteration terminates the loop).


Termination: The loop terminates in either of the following cases,

We have found index i such that v = Ai

We reached the end of the array, i.e. we did not find v in the array A. So, we return NIL


In either case, our algorithm does exactly what was required, which means the algorithm is correct.
```

### 4. Consider the problem of adding two n-bit binary integers, stored in two n-element arrays A and B. The sum of the two integers should be stored in binary form in an (n + 1)-element array C. State the problem formally and write pseudocode foradding the two integers.

`Answer` :
