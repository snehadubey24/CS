public class Merge_Sort {

    public static void merge(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int leftArr[] = new int[n1 + 1];
        int rightArr[] = new int[n1 + 1];

        // Copying items into the array
        for (int i = 0; i < n1 - 1; i++) {
            leftArr[i] = arr[low + i];
        }
        for (int j = 0; j < n2 - 1; j++) {
            rightArr[j] = arr[(mid + 1) + j];
        }

        leftArr[n1] = Integer.MAX_VALUE;
        rightArr[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = 0; k <= high; k++) {
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