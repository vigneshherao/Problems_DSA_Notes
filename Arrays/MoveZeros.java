package Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};

        //make a varible with an check to for tracking in place zeros
        int check = 0;

        //loop till the non zero element comes first
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0){
                arr[check++] = arr[i];
            }
        }

        //add zeros to remaing array length
        for(int i = check;i<arr.length;i++){
            arr[i] = 0;
        }



        for(int i :arr){
            System.out.println(i);
        }





    }
}
