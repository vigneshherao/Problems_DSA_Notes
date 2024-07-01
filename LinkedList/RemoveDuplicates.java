class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        System.out.println("Before removing duplicates:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("After removing duplicates:");
        printList(head);
    }

    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode first = head;
        ListNode second = first.next;

        while (second != null) {
            if (first.val == second.val) {
                first.next = second.next;
                second = first.next;
            } else {
                first = first.next;
                second = second.next;
            }
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
