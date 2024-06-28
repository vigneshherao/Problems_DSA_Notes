// class Sol
// {
// 	public static Node findUnion(Node head1,Node head2)
// 	{
// 	    //Add your code here.
// 	    HashSet<Integer> arr = new HashSet<>();
	    
// 	    Node temp1 = head1;
// 	    while(temp1!=null){
	        
// 	        arr.add(temp1.data);
	        
// 	        temp1 = temp1.next;
	        
// 	    }
	    
// 	    Node temp2 = head2;
// 	    while(temp2!=null){
	        
// 	        arr.add(temp2.data);
	        
// 	        temp2 = temp2.next;
	        
// 	    }
	    
// 	    List<Integer> sortedList = new ArrayList<>(arr);
//         Collections.sort(sortedList);
	    
// 	    Node unionHead = null;
//         Node unionTail = null;


//         for(Integer n:sortedList){
//              Node newNode = new Node(n);
//             if(unionHead==null){
//                 unionHead=unionTail=newNode;
//             }
//             else{
//                 unionTail.next = newNode;
//                 unionTail = newNode;
//             }
//         }
	    
// 	    return unionHead;
	    
// 	}

	
	
	
// }