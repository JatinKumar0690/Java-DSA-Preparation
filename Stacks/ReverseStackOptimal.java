import java.util.Stack;

public class ReverseStackOptimal {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        // recursion
        pushAtBottom(s, data);
        s.add(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        // recursion
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }
    }
}
