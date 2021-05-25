# QuickSort

---

## PseudoCode

```cpp
PARTITION(A,low,high)
    x = A[high]
    i = p - 1
    for j = low to high
        if A[j] <= x
            i = i + 1
            exchange A[i] with A[j]

    exchange A[i+ 1] with A[high]
    return i + 1


QUICKSORT(A,low,high)
    if low < high
        pivot = parition(A,low,high)
        QUICKSORT(A,low,pivot-1)
        QUICKSORT(A,pivot + 1,high)
```

## Java Program

```java

public class QuickSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 21, 38, 94, 73, 22, 15, 14 };
        int low = 0;
        int high = arr.length - 1;
        quicksort(arr, low, high);

        // Printing the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```
