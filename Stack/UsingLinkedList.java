package Stack;

public class UsingLinkedList {
    public static class Linked {
        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
            }
        }

        public Node head;

        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop() {
            if (head == null) {
                return -1; 
            }

            int popValue = head.data;
            head = head.next;
            return popValue;
        }

        public int peek() {
            if (head == null) {
                return -1; 
            }

            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        Linked ll = new Linked();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        while (!ll.isEmpty()) {
            System.out.println(ll.peek());
            ll.pop();
        }
    }
}
