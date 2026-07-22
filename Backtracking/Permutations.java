public class Permutations {
    static void printPermutation(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Work or Recursion
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");

    }
}
