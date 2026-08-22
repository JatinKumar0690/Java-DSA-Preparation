//Adding Nodes to the last of elements

public class AddLast {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

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

    public static void main(String[] args) {
        AddLast ll = new AddLast();
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
    }
}
