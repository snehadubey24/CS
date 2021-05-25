# HeapSort

---

## Heaps

- The (binary) heap data structure is an array object that we can view as a nearly complete binary tree. Each node of the tree corresopnds to an element of the array. The tree is completely filled on all levels except possibly the lowest (leaf nodes), which is filled in the left to right order.

![](https://i.ibb.co/fSPfsdr/Annotation-2021-05-24-054223.png)

## Types of Heaps

- Min Heap - The roots should be minimum for the entire tree/subtree.

- Max Heap - The roots should be maximum for the entire tree/subtree.

### NOTE :

- Children/Parent of a Node in Complete Binar Tree

  - 0 based Indexing

    - Left Child = 2 \* i + 1
    - Right Child = 2 \* i + 2
    - Parent Node = (i - 1) / 2

  - 1 based Indexing (as in PseudoCode)

    - Left Child = 2 \* i
    - Right Child = 2 \* i + 1

    - Parent Node = i / 2

# PseudoCode

```cpp

MAX-HEAPIFY(A,i)

    l = LEFT(i) //Left Child
    r = RIGHT(i) //Right Child

    if l <= A.heapSize and A[l] > A[i]
        largest = l

    else largest = i

    if r <= A.heapSize and A[r] > A[largest]
        largest = r

    if largest != i
        exchange A[i] with A[largest]
        MAX-HEAPIFY(A,largest)



BUILD-MAX-HEAP(A)

    A.heapSize = A.length

    for i = A.length/2 downto 1 //It means to heapify only the nodes other than the leaf nodes
        MAX-HEAPIFY(A,i)



HEAPSORT(A)

    BUILD-MAX-HEAP(A)

    for i = A.length downto 2
        exchange A[1] with A[i]
        A.heapSize = A.heapSize - 1
        MAX-HEAPIFY(A,1)



Time Complexity : O(n logn)
    * n - Build Maxheap
    * logn - max-heapify

HeapSort is an In-Place Sorting Algorithm.

```

# C++ Program :

```cpp
#include <iostream>
using namespace std;

// To heapify a subtree rooted with node i which is
// an index in arr[]. n is size of heap
void heapify(int arr[], int n, int i)
{
   int largest = i; // Initialize largest as root
   int l = 2 * i + 1; // left = 2*i + 1
   int r = 2 * i + 2; // right = 2*i + 2

   // If left child is larger than root
   if (l < n && arr[l] > arr[largest])
       largest = l;

   // If right child is larger than largest so far
   if (r < n && arr[r] > arr[largest])
       largest = r;

   // If largest is not root
   if (largest != i) {
       swap(arr[i], arr[largest]);

       // Recursively heapify the affected sub-tree
       heapify(arr, n, largest);
   }
}

// main function to do heap sort
void heapSort(int arr[], int n)
{
   // Build heap (rearrange array)
   for (int i = n / 2 - 1; i >= 0; i--)
       heapify(arr, n, i);

   // One by one extract an element from heap
   for (int i = n - 1; i >= 0; i--) {
       // Move current root to end
       swap(arr[0], arr[i]);

       // call max heapify on the reduced heap
       heapify(arr, i, 0);
   }
}

/* A utility function to print array of size n */
void printArray(int arr[], int n)
{
   for (int i = 0; i < n; ++i)
       cout << arr[i] << " ";
   cout << "\n";
}

// Driver program
int main()
{
   int arr[] = { 12, 11, 13, 5, 6, 7 };
   int n = sizeof(arr) / sizeof(arr[0]);

   heapSort(arr, n);

   cout << "Sorted array is \n";
   printArray(arr, n);
}
```

- CodeSource : [Geeks For Geeks](https://www.geeksforgeeks.org/cpp-program-for-heap-sort/)
