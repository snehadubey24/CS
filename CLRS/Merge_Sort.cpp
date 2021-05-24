#include <bits/stdc++.h>
#include <vector>
using namespace std;

void merge(int arr[], int low, int mid, int high)
{
    int n1 = mid - low + 1;
    int n2 = high - mid;

    vector<int> leftArr;
    for (int i = 0; i < n1; i++)
    {
        vector.push_back(arr[low + i]);
    }
    cout << leftArr;
}
int main()
{
    //Driver Program
    int arr[] = {4, 5, 6, 7};
    merge(arr, 0, 1, 3);
}