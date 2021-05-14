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
