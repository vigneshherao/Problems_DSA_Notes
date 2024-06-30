
//what i did is i just reversed the ll from 0 to rotate element and rotate element +1 to n;
//and reverse that again
//you will get the result

// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
//         if (head == null || k == 0) return head;

//         int size = size(head);
//         k = k % size;
//         if (k == 0) return head;
//         ListNode newTail = head;
//         for (int i = 0; i < size - k - 1; i++) {
//             newTail = newTail.next;
//         }

//         ListNode newHead = newTail.next;
//         newTail.next = null;
//         ListNode end = newHead;
//         while (end.next != null) {
//             end = end.next;
//         }
//         end.next = head;

//         return newHead;
//     }

//     public static int size(ListNode head) {
//         int size = 0;
//         ListNode temp = head;
//         while (temp != null) {
//             temp = temp.next;
//             size++;
//         }
//         return size;
//     }
// }
