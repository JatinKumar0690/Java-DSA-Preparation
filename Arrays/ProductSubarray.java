//Brute force approach to return the maximum product of subarray
public class ProductSubarray {
    public static int productSubarray(int arr[]) {
        int n = arr.length;
        int currentProduct = 1;
        int maximumProduct = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currentProduct = 1;
                for (int k = start; k <= end; k++) {
                    currentProduct = currentProduct * arr[k];
                }
                maximumProduct = Math.max(currentProduct, maximumProduct);
            }

        }
        return maximumProduct;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -2, 4 };
        System.out.print(productSubarray(arr));
    }
}
