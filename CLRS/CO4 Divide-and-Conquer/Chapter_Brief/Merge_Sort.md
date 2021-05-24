# Merge Sort

---

## PseudoCode

```cpp

MERGE(A,low,mid,high)

    n1 = mid - low + 1
    n2 = high - mid

    let L[1,...,n1+1] and R[1,...,n2+1] be new arrays

    // Copying Elements into the newly created array
    for i = 1 to n1
        L[i] = A[low + i - 1]

    for j = 1 to n2
        R[j] = A[mid + j]

    L[n1 + 1] = Math.Max_value
    R[n2 + 1] = Math.Max_value

    i = 1
    j = 1

    // Copying/Combining elements in the array A (in sorted order)

    for k = low to high
        if L[i] <= R[j]
            A[k] = L[i]
            i = i + 1

        else A[k] = R[j]
        j = j + 1



MERGE_SORT(A,low,high)

    if low < high
        mid = (low + high) / 2

        MERGE_SORT(A,low,mid)
        MERGE_SORT(A,mid+1,high)
        MERGE(A,low,mid,high)

```
