import java.util.*;

public class ReverseStackBrute {
    public static void main(String args[]) {
        //First Stack
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(2);
        s.add(1);
        System.out.println(s);

        //second stack
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty()) {
            ns.add(s.pop());
        }
        System.out.println(ns);
    }
}
