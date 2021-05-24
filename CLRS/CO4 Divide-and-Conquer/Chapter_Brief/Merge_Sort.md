# Merge Sort

---

![](https://richardssoftware.blob.core.windows.net/images/mergesort.gif)

## PseudoCode

```cpp

MERGE(A,low,mid,high)

    n1 = mid - low + 1
    n2 = high - mid

    let L[1,...,n1+1] and R[1,...,n2+1] be new arrays

    // Copying Elements into the newly created array
    for i = 1 to n1
        L[i] = A[low + i]

    for j = 1 to n2
        R[j] = A[mid + 1 +j]

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

# Java Program

```java
public class Merge_Sort {

    public static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int leftArr[] = new int[n1 + 1];
        int rightArr[] = new int[n1 + 1];

        leftArr[n1] = Integer.MAX_VALUE;
        rightArr[n2] = Integer.MAX_VALUE;

        // Copying items into the array
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;

        for (int k = low; k <= high; k++) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
        }
    }

    public static void merge_sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(arr, low, mid);
            merge_sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 12, 81, 64, 56, 32 };
        int low = 0;
        int high = arr.length - 1;
        merge_sort(arr, low, high);

        // Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

```
