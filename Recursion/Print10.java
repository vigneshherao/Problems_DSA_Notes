package Recursion;

public class Print10 {
    public static void main(String[] args) {
        int N = 10;
        printOneToTen(N);
    }
    public static void printOneToTen(int N ){

        if(N==1){
            System.out.println(N+" ");
            return;
        }
        
        
        printOneToTen(N-1);
        
    
        
        System.out.println(N+" ");
    
    }
}
