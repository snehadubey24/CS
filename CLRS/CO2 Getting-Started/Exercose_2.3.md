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
