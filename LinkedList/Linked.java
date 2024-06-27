package LinkedList;

public class Linked {


    public class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static  int size;

    //Adding to First Element
    public void addFirst(int data){
      
        Node newNode = new Node(data);
        if(head==null){
            head = tail =  newNode;
        }

        newNode.next = head;

        head = newNode;
        size++;

    }


     //Adding to Last Element
    public void addLast(int data){
        
        Node newNode = new Node(data);

        if(head==null){
            head = tail =  newNode;
        }

        tail.next = newNode;

         tail = newNode;
         size++;

    }


 //Adding to Middle Element
    public void addMiddle(int data,int index){
        Node newNode = new Node(data);
        if(index==0){
            if(head.next==null){
                size++;
                head=tail=newNode;
            }
            return;
        }


        Node temp;

        temp = head;
        int i = 0;
        size++;
        while(i<index-1){
            temp = temp.next;
            i++;  
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }


 //Printing Element
    public  void Printf(){
        Node temp;
        
        temp = head;

        while(temp!=null){
            System.err.println(temp.data);

            temp = temp.next;
        }
        System.err.println("the size of the array is " + size);

    }

    //Removing an first element from LL 

    public int removeFirst(){

        if(size==0){
            int val = Integer.MIN_VALUE;
            return val;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            return val;

        }
        size--;
        int value = head.data;
        head = head.next;
        return value;
    }


    //Removing an Element From the last
    public int DeleteLast(){
        Node temp;
        temp = head;
        if(size==0){
            System.out.println("Its Empty ");
            int val = Integer.MIN_VALUE;
            return val;
        }
        else if(size==1){
            System.out.println("Its Empty ");
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }

   
        for(int i = 0; i<size-2;i++){
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
        
    }

    public  int returnELement(int target){
        Node temp;
        temp = head;
        int i = 0;
        while(i<=size-1){
            if(temp.data==target){
                return i;
            }
            temp = temp.next;
            i++;
        }



        return -1;
    }
    //Search a key using Linked List Recursion
    public static int searchKey(Node head,int key){
        if(head==null){
            return -1;
        };

        if(head.data==key){
            return 0;
        }

        int index = searchKey(head.next,key);
        if(index==-1){
            return -1;
        }

        return index+1;
    }

    //Reversing an array    
    public  void Reverse(){
        Node prev = null;Node current = head;
        Node next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        head = prev;
    }


    //Remove the element from the end

    public void removeElement(Node head,int n){
        int size = 0;
        Node temp = head;

        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(size==n){
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        int till = size-n;
        while(i<till){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;   

    }


    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindromeOrNot(Node head){
        if(head==null || head.next==null){
            return true;
        }

        Node mid = findMid(head);

        Node prev = null;Node current = mid;
        Node next;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        Node right = prev;
        Node left = head;


        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;

        }







        return true;
    }


    public static void main(String[] args) {

        Linked ll = new Linked();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

         
        ll.Printf();
        System.out.println(ll.returnELement(4));

        System.out.println("The index is at " +searchKey(head, 4));
        ll.Reverse();
        ll.Printf();
        ll.Printf();

        System.out.println(ll.isPalindromeOrNot(head));

    }
}


