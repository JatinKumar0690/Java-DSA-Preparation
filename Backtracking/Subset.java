//Find & print all the subest of a given string "abc"
//Print => a, b, c, ab, bc, ca, abc, null = 8 Subsets

public class Subset {
    public static void findSubset(String ans, String str, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursion
        
        // Yes choice
        findSubset(ans + str.charAt(i), str, i + 1);

        // No choice
        findSubset(ans, str, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset("", str, 0);
    }
}
