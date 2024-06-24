package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.err.println(result);
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char charS[] = s.toCharArray();
            char charT[] = t.toCharArray();
            
            Arrays.sort(charS);
            Arrays.sort(charT);

            boolean result = Arrays.equals(charS,charT);
            return result;

        }
        else{
            return false;
        }
    }
}
