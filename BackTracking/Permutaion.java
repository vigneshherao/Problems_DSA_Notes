package BackTracking;

public class Permutaion {
    public static void main(String[] args) {    
        String str = "abc";
        String s = "";
        createPermutaion(str,s);
    }
    public static void createPermutaion(String str,String s){
        if(str.length()==0){
            System.out.println(s);
            return;
        }

        for(int i = 0; i<str.length();i++){
            char curr = str.charAt(i);
            String  strs = str.substring(0, i) + str.substring(i+1);
            createPermutaion(strs,s+curr);
            

        }
        
    }
}
