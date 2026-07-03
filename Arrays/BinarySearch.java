//Prerequisite => The array must be sorted to use Binary search

public class BinarySearch {
    public static int binarySearch(int marks[], int target) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == target) {
                return mid;
            } else if (marks[mid] > target) {
                end = mid - 1; // search left half
            } else {
                start = mid + 1; // search right half
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 2, 4, 6, 8, 10, 12 };
        int target = 8;
        System.out.println("The value found at index " + binarySearch(marks, target));
        ;
    }
}
