package BinarySearch;

public class FirstAndLast {
    public static void Main(String args[]) {
        int nums[] = {5,7,7,8,8,10};
        int index[] = new int[2];
        int start  = 0;
        int end = nums.length-1;
        int target = 8;
        index[0] = SearchIndex1(nums,start,end,target);
        index[1] = SearchIndex2(nums,start,end,target);
        
        for(int n:nums){
            System.err.println(n);
        }
    }


    public static int SearchIndex1(int[] nums,int start,int end,int target){
        int index = -1;
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(nums[mid]==target){
                index = mid;
            }

            if(nums[mid]>=target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return index;
    }

        public static int SearchIndex2(int[] nums,int start,int end,int target){
            int index = -1;
        while(start<=end){
            int mid = (start + end)  / 2;

            if(nums[mid]==target){
                index = mid;
            }
            if(nums[mid]<=target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return index;
    }
}
