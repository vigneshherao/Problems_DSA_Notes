package Arrays;

import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;

         HashMap<Integer,Integer> check = new HashMap<>();
        int mp[] = new int[2];
        check.put(nums[0],0);
        for(int i = 1; i<nums.length;i++){
            int value = target - nums[i];
            if(check.containsKey(value)){
                mp[0] = i;
                mp[1] = check.get(value);
            }
                check.put(nums[i],i);
        }
        System.out.println(mp[0]);
        System.out.println(mp[1]);

    }
}