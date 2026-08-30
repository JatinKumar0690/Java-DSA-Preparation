public class IterativeSearch {
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

    public int search(int key) {
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("The key is found at index " + ll.search(5));
        ll.print();
    }
}
