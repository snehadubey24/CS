# Excercise 2.3

---

### 1. Using Figure 2.4 as a model, illustrate the operation of merge sort on the array A = {3, 41, 52, 26, 38, 57, 9, 49}.

`Answer` :

![](https://github.com/gzc/CLRS/raw/master/C02-Getting-Started/repo/s3/1.png)

### 2. Rewrite the MERGE procedure so that it does not use sentinels, instead stopping once either array L or R has had all its elements copied back to A and then copying the remainder of the other array back into A.

`Answer` :

```cpp
MERGE(A, p, q, r)

 n1 = q - p + 1
 n2 = r - q
 create arrays L[1..n1] and R[1..n2]
 for i = 1 to n1
   L[i] = A[p + i - 1]
 for j = 1 to n2
   R[j] = A[q + j]
 i = 1
 j = 1
 for k = p to r
   if i > n1
    A[k] = R[j]
    j = j + 1
   else if j > n2
    A[k] = L[i]
    i = i + 1
   else if L[i] ≤ R[j]
    A[k] = L[i]
    i = i + 1
   else
    A[k] = R[j]
    j = j + 1
```

### 3. ![](https://i.ibb.co/xfvDzx4/my-basic-app.png)

`Answer` :

![](https://i.ibb.co/NWXmtnJ/my-basic-app.png)

### 4. We can express insertion sort as a recursive procedure as follows. In order to sort A[1...n], we recursively sort A[1...n-1] and then insert A[n] into the sorted array A[1...n-1]. Write a recurrence for the running time of this recursive version of insertion sort.

`Answer` :
![](https://i.ibb.co/mykT6WX/my-basic-app.png)

### 5. Referring back to the searching problem (see Exercise 2.1-3), observe that if the sequence A is sorted, we can check the midpoint of the sequence against and eliminate half of the sequence from further consideration. The binary search algorithm repeats this procedure, halving the size of the remaining portion of the sequence each time. Write pseudocode, either iterative or recursive, for binary search. Argue that the worst-case running time of binary search is O(lg n).

`Answer` :

PseudoCode :

```cpp
ITERATIVE-BINARY_SEARCH(A, v)
 low = A[1]
 high = A[A.length]
 while low &le; high
  mid = (low + high) / 2
  if v == A[mid]
   return mid
  elseif v > A[mid]
   low = mid + 1
  else
   high = mid - 1
 return NIL
```

```cpp
RECURSIVE-BINARY-SEARCH(A, v, low, high)
 if low > high
    return NIL
 mid = (low + high) / 2
 if v == A[mid]
  return mid
 elseif v > A[mid]
  RECURSIVE-BINARY-SEARCH(A, v, mid + 1, high)
 else
  RECURSIVE-BINARY-SEARCH(A, v, low, mid - 1)
```

`Intuitively, in worst case, i.e. when v is not at all present in A, we need to binary search over the whole array to return NIL. So in worst-case, we need to repeatedly divide the array by 2. So the running time is nothing but how many times the input size can be divided by 2, i.e. lgn. And using recurrence formula, we can say running time T(n)=T((n−1)/2)+Θ(1)=Θ(lgn).`
