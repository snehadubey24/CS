public class Merge_Sort {

    // public static void merge(int arr[], int low, int mid, int high) {
    // int n1 = mid - low + 1;
    // int n2 = high - mid;

    // int L[] = new int[n1 + 1];
    // int R[] = new int[n2 + 1];

    // // Copying the elements into the array
    // for (int i = 0; i < n1; i++) {
    // L[i] = arr[low + i];
    // }

    // for (int j = 0; j < n2; j++) {
    // R[j] = arr[(mid + 1) + j];
    // }

    // L[n1 + 1] = Integer.MAX_VALUE;
    // R[n2 + 1] = Integer.MAX_VALUE;

    // int i = 0;
    // int j = 0;

    // for (int k = 0; k <= high; k++) {
    // if (L[i] < R[j]) {
    // arr[k] = L[i];
    // i++;
    // } else {
    // arr[k] = R[j];
    // j++;
    // }
    // }

    // }

    public static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int leftArr[] = new int[n1];
        int rightArr[] = new int[n1];

        // Copying items into the array
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[(mid + 1) + j];
        }

        // Copying elements from the newly created array to the original array in a
        // sorted order
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
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