import java.util.ArrayList;

public class ArrayListStack {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push --> To add from top
        public static void push(int data) {
            list.add(data);
        }

        // pop --> To delete top element of stack
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek --> To see from top
        public static int peek() {
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
