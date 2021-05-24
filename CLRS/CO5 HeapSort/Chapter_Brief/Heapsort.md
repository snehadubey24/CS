# HeapSort

---

## Heaps

- The (binary) heap data structure is an array object that we can view as a nearly complete binary tree. Each node of the tree corresopnds to an element of the array. The tree is completely filled on all levels except possibly the lowest (leaf nodes), which is filled in the left to right order.

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
        exchange A[i]  with A[largest]
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



```
