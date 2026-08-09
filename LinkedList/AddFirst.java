//Add nodes to the first.

public class AddFirst {
    public static class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step1 --> To create a new LinkedList
        Node newNode = new Node(data);

        // BaseCase
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 --> Linking step
        newNode.next = head;
        // step3 --> Assigning head to the very first Node
        head = newNode;

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("LinkedList is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {
        AddFirst ll = new AddFirst();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
    }
}
