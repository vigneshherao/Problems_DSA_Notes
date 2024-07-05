package Practice;

public class Practice{
    public static void main(String[] args) {
        String str = "abc";
        String newString = "";
        int i = 0;
        callStack(str,newString,i);
    }
    public static void callStack(String str,String newString,int i){
        if(i==str.length()){
            System.out.println(newString);
            return;
        }

        callStack(str, newString+str.charAt(i), i+1);
        callStack(str, newString,i+1);



      

        


    }
}