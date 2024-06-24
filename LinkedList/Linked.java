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


    public static void main(String[] args) {

        Linked ll = new Linked();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(5, 2);

         
        ll.Printf();
        System.out.println(ll.returnELement(4));
    }
}


