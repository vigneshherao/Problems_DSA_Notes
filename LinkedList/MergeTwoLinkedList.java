

//Intution
//what i did is we can create a new node with dummy value as -1 for itearating;
// i assinged it for temp node; will iterate through list1 and list2 will gets null
//check if left is smaller or right is smaller
//return after sorting with .next becuase delete -1 ele in node



// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode mergedLinkedList = new ListNode(-1);
//         ListNode temp = mergedLinkedList;

//         while(list1!=null && list2!=null){
//             if(list1.val<=list2.val){
//                 temp.next = list1;
//                 list1 = list1.next;
//                 temp = temp.next;

//             }
//             else{
//                 temp.next = list2;
//                 list2 = list2.next;
//                 temp = temp.next;
//             }
//         }

//         while(list1!=null){
//              temp.next = list1;
//              list1 = list1.next;
//              temp = temp.next;
//         }

//         while(list2!=null){
//              temp.next = list2;
//              list2 = list2.next;
//              temp = temp.next;
//         }


//         return mergedLinkedList.next;

//     }
// }