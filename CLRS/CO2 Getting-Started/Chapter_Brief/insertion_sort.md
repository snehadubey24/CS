# Insertion Sort

---

## PseudoCode

```cpp

     INSERTION-SORT(A)

     for j = 2 to A.length
         key = A[j]
        //Insert A[j] into the sorted sequence A[1...j-1]
         i = j -1
         while i > 0 and A[i] > key
             A[i+1] = A[i]
             i = i - 1
         A[i + 1] = key


    Time Complexity :
            Worst Case : O(n^2)
            Average Case : O(n^2)
            Insertion Sort is an in-place algorithm
```

<br>

## C++ Program :

<br>

```cpp
#include <iostream>
using namespace std;

void insertionSort(int A[], int size)
{

    for (int j = 2; j < size; j++)
    {
        int key = A[j];

        //Insert A[j] into the sorted sequence A[1...j-1]
        int i = j - 1;

        while (i >= 0 && A[i] > key)
        {
            A[i + 1] = A[i];
            i--;
        }

        A[i + 1] = key;
    }

    //Printing Array
    for (int i = 0; i < size; i++)
    {
        cout << A[i] << " ";
    }

}

int main()
{
//Array Initialization
int A[] = {31, 41, 59, 26, 41, 58};

    int size = 6;

    //Sorting A
    insertionSort(A, size);
    return 0;

}

```
