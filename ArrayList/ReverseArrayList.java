package ArrayList;
import java.util.*;;


public class ReverseArrayList{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        while(arr.size()!=0){
            System.out.println(arr.size());
            arr.remove(arr.size()-1);
        }
    }
}