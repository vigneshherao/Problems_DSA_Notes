package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int num = 0;
        int arr[] = {2,2,3,4,3,};

        for(int i = 0; i<arr.length;i++){
            num = arr[i] ^ num;

        }
        System.out.println(num);
    }
}
