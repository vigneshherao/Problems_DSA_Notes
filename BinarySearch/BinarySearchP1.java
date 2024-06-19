package BinarySearch;

public class BinarySearchP1 {
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        search(nums,target);
    }
    public  static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        return SearchBinary(nums,target,start,end);
    }

    public static int SearchBinary(int[] nums,int target,int start,int end){
        
        while(start<=end){
            int mid = start +(end -start) / 2;

            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                start = mid + 1;
            }
            else if(target<nums[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}
