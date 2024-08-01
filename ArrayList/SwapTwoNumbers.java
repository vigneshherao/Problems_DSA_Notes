package ArrayList;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);


        int index1 = 1;
        int index2 = 3;


        int temp = arr.get(index2);
        arr.set(index2,arr.get(index1));
        arr.set(index1,temp);


        for(Integer i:arr){
            System.out.println(i);
        }



    }
}
