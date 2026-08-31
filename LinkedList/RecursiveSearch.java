public class RecursiveSearch {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public int helper(Node head, int key) {
        // Base-case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]) {
        RecursiveSearch ll = new RecursiveSearch();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(8);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println("The key is found at index " + ll.recSearch(8));
    }
}
