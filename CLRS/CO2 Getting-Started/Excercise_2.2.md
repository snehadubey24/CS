# Excercise 2.2

---

### 1. Express the function n^3/1000 - 100n^2 - 100n + 3 in terms of O notation

`Answer`:

```
The leading term of the function ignoring the constant coefficient is n^3.
So, the function in θ−notation will be θ(n^3).
```

### 2. Consider sorting n numbers stored in array A by first finding the smallest element of A and exchanging it with the element in A[1]. Then find the second smallest element of A, and exchange it with A[2]. Continue in this manner for the first n-1 elements of A. Write pseudocode for this algorithm, which is known as selection sort. What loop invariant does this algorithm maintain? Why does it need to run for only the first n - 1 elements, rather than for all n elements? Give the best-case and worst-case running times of selection sort in O notation.

`Answer` :

PseudoCode

```cpp
SELECTION-SORT(A):

  for i = 1 to A.length - 1
      min = i
      for j = i + 1 to A.length
          if A[j] < A[min]
              min = j
      temp = A[i]
      A[i] = A[min]
      A[min] = temp
```

![](https://i.ibb.co/Lzm91nZ/my-basic-app.png)

### 3. Consider linear search again (see Exercise 2.1-3). How many elements of the input sequence need to be checked on the average, assuming that the element being searched for is equally likely to be any element in the array? How about in the worst case? What are the average-case and worst-case running times of linear search in O notation? Justify your answers

`Answer` :

```
If the element is present in the sequence, half of the elements are likely to be
checked before it is found in the average case. In the worst case,
all of them will be checked. That is, n/2 checks for the average case and n for the worst case.

Both of them are Θ(n).
```
