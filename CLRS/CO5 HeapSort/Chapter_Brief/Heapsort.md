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
    l = LEFT(i)

```
