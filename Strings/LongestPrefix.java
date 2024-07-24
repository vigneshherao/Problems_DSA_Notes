package Strings;
public class LongestPrefix{
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};

        //set prefix sum as first word flower;
        String prefix = strs[0];

        //it will start traversing from loop from 1
        for(int i = 1; i<strs.length;i++){
            //it will check the flower and flow index 
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }

        }


        System.out.println(prefix);

    }
}