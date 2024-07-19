package Arrays;
import java.util.*;

public class ThreeSumOptimal {
    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first element
            }
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    j++;
                    k--;
                    // Skip duplicates for the second and third elements
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
    }
}
