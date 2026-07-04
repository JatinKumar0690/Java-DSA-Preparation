public class SubArrays {
    public static void subArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int marks[] = { 2, 4, 6, 8, 10 };
        subArray(marks);
    }
}
