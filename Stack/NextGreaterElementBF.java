package Stack;

public class NextGreaterElementBF {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};

        int newArr[] = new int[arr.length];


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    newArr[i] = arr[j];
                    break;
                }
            }
        }

        for(int i = 0; i<newArr.length;i++){
            if(newArr[i]==0){
                newArr[i] = -1;
            }
        }


        for(int i :newArr){
            System.out.println(i);
        }
    }
}
