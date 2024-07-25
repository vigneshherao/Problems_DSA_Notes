package SlidingWindow;

import java.util.HashSet;

public class CountTripletBF {
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2};
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i : arr){
            hash.add(i);
        }
        
        
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(hash.contains(arr[i]+arr[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
