package Stack;

public class UsingAnArray {
    public static void main(String[] args) {
        UseArray stack = new UseArray(5); // Create a stack of size 5
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element is: " + stack.peek()); // Should print 30
        System.out.println("Popped element is: " + stack.pop()); // Should print 30
        
        stack.push(40);
        
        System.out.println("Top element is: " + stack.peek()); // Should print 40
    }
    
    public static class UseArray {
        private int[] arr;
        private int top;
        private int capacity;
        
        // Constructor to initialize the stack
        public UseArray(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }
        
        // Utility function to add an element `x` to the stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = x;
        }
        
        // Utility function to pop a top element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }
        
        // Utility function to return the top element of the stack
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                System.out.println("Stack is empty");
                return -1;
            }
        }
        
        // Utility function to check if the stack is empty or not
        public boolean isEmpty() {
            return top == -1;
        }
        
        // Utility function to check if the stack is full or not
        public boolean isFull() {
            return top == capacity - 1;
        }
    }
}
