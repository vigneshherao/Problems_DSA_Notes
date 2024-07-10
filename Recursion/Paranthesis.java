package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
    public static void main(String[] args) {
         List<String> s = new ArrayList<String>();
         int n = 3;
         String createStrings = "";
         int open = 0;
         int close = 0;
         createStrings(s,n,createStrings,open,close);
         System.out.println(s);
    }
    public static void createStrings(List<String> s,int n,String createStrings,int open,int close){
        if(createStrings.length()==n*2){
            s.add(createStrings);
            return;
        }

        if(open<3){
            createStrings(s,n,createStrings+"(",open+1,close);

        }
        if(close<open){
            createStrings(s,n,createStrings+")",open,close+1);
        }
    }
}
