public class QuickSort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        // Last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // LEFT Part
        quickSort(arr, pIdx + 1, ei); // Right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { -1, 5, 2, 1, 2, 3, 4 };
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}