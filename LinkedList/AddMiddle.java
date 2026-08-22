public class AddMiddle {
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

    public void addLast(int data) {
        // step1 -->To create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 --> Linking step
        tail.next = newNode;
        // step 3
        tail = newNode;

    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
