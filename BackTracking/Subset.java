package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        createSubsets(nums,arr,0,newArr);
        System.out.println(arr);
    }
    public static void createSubsets(int[] nums,List<List<Integer>> arr,int index,ArrayList<Integer> newArr){
        //if the index == 3 which means no other element so print it
        if(index==nums.length){
            arr.add(new ArrayList<>(newArr));
            return;
        }

        newArr.add(nums[index]);
        createSubsets(nums,arr,index+1,newArr);
        //remove the element last add using back traciing
        newArr.remove(newArr.size()-1);
        createSubsets(nums,arr,index+1,newArr);
    }
}
