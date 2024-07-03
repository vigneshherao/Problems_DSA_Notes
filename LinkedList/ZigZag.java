// class Solution {
//     public void reorderList(ListNode head) {
//         if(head==null || head.next==null){
//             return;
//         }
//         ListNode mid = findMiddle(head);
//         ListNode leftHalf = head;
//         ListNode rightHalf = mid.next;
//         mid.next = null;

//         rightHalf = reverse(rightHalf);

//         while(leftHalf!=null && rightHalf!=null){
//             ListNode temp1 = leftHalf.next;
//             ListNode temp2 = rightHalf.next;
            
//             leftHalf.next = rightHalf;
//             rightHalf.next = temp1;

//             leftHalf = temp1;
//             rightHalf = temp2;

//         }

        
//     }
//     public static ListNode findMiddle(ListNode head){
//         ListNode slow = head;
//         ListNode fast = head.next;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public static ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next;

//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         } return prev;
//     }
// }