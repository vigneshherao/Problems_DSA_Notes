package BinarySearch;

public class FindFloor {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int result = findFloor(arr, arr.length - 1, 2);
        System.out.println(result); 
    }

    public static int findFloor(int arr[], int n, int x) {
        int start = 0;
        int end = n;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] <= x) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}
