package ArrayList;

import java.util.ArrayList;

public class ListOfList {   
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();


        for(int i = 1; i<=5;i++){
            list1.add( i*2);
            list2.add( i*3);
            list3.add(i*4);
        }

        for(int i = 0; i<main.size();i++){
            ArrayList<Integer> arr = main.get(i);

            for(int k = 0; k<arr.size();k++){
                System.out.print(arr.get(k)+" ");
            }
            System.out.println();
        }


    }
}
