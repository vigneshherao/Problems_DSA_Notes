package Strings;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg"; String t = "add";
        boolean result = isIsomorphic(s,t);
        System.err.println(result);
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;

        int sArr[] = new int[256];
        int tArr[] = new int[256];

        for(int i = 0; i<sArr.length;i++){
            sArr[i]=-1;
            tArr[i]=-1;
        }

        for(int i = 0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);


            if(sArr[sChar]==-1 && tArr[tChar]==-1){
                sArr[sChar] = tChar;
                tArr[tChar] = sChar;
            }
            else if(sArr[sChar] != tChar || tArr[tChar] != sChar){
                return false;
            }
        }

    return true;
        
    }
}
