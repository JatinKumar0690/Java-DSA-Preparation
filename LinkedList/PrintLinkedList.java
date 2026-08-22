public class PrintLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create a New node => Step1
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Linking step => Step2
        newNode.next = head;
        // step 3
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 =>Create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 => Linking step
        tail.next = newNode;
        // step 3
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        // To create a temporary variable
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        PrintLinkedList ll = new PrintLinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
    }
}
