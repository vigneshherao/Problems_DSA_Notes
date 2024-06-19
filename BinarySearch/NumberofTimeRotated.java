package BinarySearch;

public class NumberofTimeRotated {

        public static void main(String[] args) {
            int arr[] = {6, 8,9, 1, 2};
            
            int start = 0;
            int end = arr.length - 1;
            int n = arr.length; // Length of the array
            
            while (start <= end) {
                // If the segment contains only one element
                if (arr[start] <= arr[end]) {
                    System.out.println(start);
                    return;
                }
                
                int mid = start + (end - start) / 2;
                
                int next = (mid + 1) % n;
                int prev = (mid + n - 1) % n;
                
                // Check if mid is the minimum element
                if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
                    System.out.println(mid);
                    return;
                }
                
                // If the left segment is sorted, search in the right segment
                if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                } else { // Otherwise, search in the left segment
                    end = mid - 1;
                }
            }
        }
    }
    
