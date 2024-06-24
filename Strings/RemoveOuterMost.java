package Strings;

public class RemoveOuterMost {
    public static void main(String[] args) {
        String s = "(()())(())";
        StringBuilder str = new StringBuilder();
        int open = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='('){
                if(open>0){
                    str.append(s.charAt(i));
                }
                open++;
            }
            else{
                open--;
                if(open>0){
                    str.append(s.charAt(i));
                }
            }
        }
        System.out.println( str.toString());
    }
}
