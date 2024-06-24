package Strings;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
       String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
      public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder n = new StringBuilder("");
        ArrayList<String> sArr = new ArrayList<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)!=' '){
                n.append(s.charAt(i));
            }
            else{
                if (n.length() > 0) {
                sArr.add(n.toString());
                n.setLength(0);
                }
            }
        }

        if(n.length()>0){
            sArr.add(n.toString());
        }

        n.setLength(0);

        for (int i = sArr.size() - 1; i >= 0; i--) {
            n.append(sArr.get(i));
            if (i > 0) {
                n.append(" ");
            }
        }
        
        return n.toString();
    
       
    }
}
