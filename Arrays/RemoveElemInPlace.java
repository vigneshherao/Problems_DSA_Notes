package Arrays;

public class RemoveElemInPlace {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        //create a varible for tracking the element for duplicates
        int check = 1;

        for(int i = 1;i<arr.length;i++){//loop till array length
            //check previous element not equal to current element
            if(arr[i]!=arr[i-1]){
                //add element to array with refernce varible and increase check
                arr[check] = arr[i];
                check++;
            }
        }

        System.out.println(check);

        for(int i = 0; i<check;i++){
            System.out.println(arr[i]);
        }
        
    }
}
