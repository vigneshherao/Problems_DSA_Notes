package LinkedList;

import java.util.LinkedList;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(2);
        ll.add(1);
        ll.add(3);
        
        Node head = new Node(ll.get(0));
        Node current = head;
        for (int i = 1; i < ll.size(); i++) {
            current.next = new Node(ll.get(i));
            current = current.next;
        }

        head = sortList(head);

    
        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    //This is the sortList Method where it make divide and conquour method it will divide each till one ele or null and merge it together
    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
         //if ele is 4 3 2 1 we will get middle as 3 and we should dive by two  left half and right half;
        Node mid = findMiddle(head);
       //making sure rightHead
        Node rightHead = mid.next;
        mid.next = null;
        
        Node leftHalf = sortList(head);
        Node rightHalf = sortList(rightHead);

        return merge(leftHalf, rightHalf);
    }

    public static Node merge(Node leftHalf, Node rightHalf) {
        //creating a ll with dummy val to iterate and return with ll+1 for real sorted elemented
        Node mergedLinkedList = new Node(-1);
        Node temp = mergedLinkedList;

        while (leftHalf != null && rightHalf != null) {
            if (leftHalf.val <= rightHalf.val) {
                temp.next = leftHalf;
                leftHalf = leftHalf.next;
            } else {
                temp.next = rightHalf;
                rightHalf = rightHalf.next;
            }
            temp = temp.next;
        }

        if (leftHalf != null) {
            temp.next = leftHalf;
        }

        if (rightHalf != null) {
            temp.next = rightHalf;
        }

        return mergedLinkedList.next;
    }
// here we will use to get middle ele and then we use the floys method to check !! 
// and also fast = head.next why means for even case we should get lefthalf thats why.

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
