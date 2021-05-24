
public class Merge_Sort {
    public static void MERGE(int arr[], int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        // Copying elements into the newly created arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[low + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + j];
        }

        L[n1 + 1] = Integer.MAX_VALUE;
        R[n2 + 1] = Integer.MAX_VALUE;

        int i = 1;
        int j = 1;

        // Copying/Combining element in the array (in sorted order)
        for (int k = low; k <= high; k++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
            }

            else
                arr[k] = R[j];
        }
    }

    public static void MERGE_SORT(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            MERGE_SORT(arr, low, mid);
            MERGE_SORT(arr, (mid + 1), high);
            MERGE(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 12, 3, 27, 28, 43, 56 };
        int low = 0;
        int high = arr.length - 1;
        MERGE_SORT(arr, low, high);

        // Printing the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}