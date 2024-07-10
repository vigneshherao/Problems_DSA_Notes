package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};

        System.out.println(SecondLargestFinder(arr));
    }

    public static int SecondLargestFinder(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;  

        for(int i = 0;i<arr.length;i++){
            //This will find out the first largest element in an array!
            if(first<arr[i]){
                second = first;
                first = arr[i];
            }
            
            //This will check for second condition will be it should not be first and should be smaller
            if(second<arr[i] &&  arr[i] <first){
                second = arr[i];
            }
            
        }
        
        if(second != Integer.MIN_VALUE){
            return second;
            
        }
        return -1; 
    }
}
