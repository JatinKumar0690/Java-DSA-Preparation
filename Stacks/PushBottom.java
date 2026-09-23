import java.util.Stack;

public class PushBottom {
    // Method
    public static void pushBottom(Stack<Integer> s, int data) {
        // Base case
        if (s.isEmpty()) {
            s.push(data); // data pushed in empty stack
            return;
        }
        int top = s.pop();  //remove from top
        pushBottom(s, data); //Recursion
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(2);
        s.add(1);
        pushBottom(s, 10);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
