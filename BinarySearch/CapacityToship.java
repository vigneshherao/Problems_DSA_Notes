package BinarySearch;

public class CapacityToship {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10}; int days = 5;
        System.out.println(shipWithinDays(weights,days));

    }
        public static int shipWithinDays(int[] weights, int days) {
            int min = Integer.MIN_VALUE;
            int totalSum = 0;
    
            for(int i = 0; i<weights.length;i++){
                if(weights[i]>min){
                    min = weights[i];
                }
                totalSum += weights[i];
            }
    
            int start = min; int end = totalSum;
            int ans = 0;
            while(start<=end){
                int capacity = start + (end-start) / 2;
    
                int daysReturn = calculateDays(capacity,weights);
    
                if(daysReturn > days){
                    start = capacity + 1;
                }
                else{
                    ans = capacity;
                    end = capacity - 1;
                }
    
                
            }
    
    
            return ans;
        }
    
        public static int calculateDays(int capacity,int[] weights){
            int days = 1;
            int n = weights.length;
            int ship_weight = 0;
    
            for(int i = 0; i<n;i++){
                if(ship_weight+weights[i]<=capacity){
                    ship_weight+=weights[i];
                }
                else{
                    ship_weight = 0;
                    days++;
                    ship_weight+=weights[i];
                }
            }
            return days;
        }
    }
