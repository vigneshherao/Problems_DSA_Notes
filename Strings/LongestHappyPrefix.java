 package Strings;

 public class LongestHappyPrefix {
    public static void main(String[] args) {
        String s = "level";
        System.out.println(longestPrefix(s));
    }   
    public static String longestPrefix(String s) {
        String[] prefix = new String[s.length()];
        String[] suffix = new String[s.length()];

        prefix[0] = Character.toString(s.charAt(0));

        for(int i=1;i<s.length();i++){
            prefix[i] = prefix[i-1] + s.charAt(i);
        }

        suffix[s.length()-1] = Character.toString(s.charAt(s.length()-1));

          for (int i = s.length() - 2; i >= 0; i--) {
            suffix[i] = s.charAt(i) + suffix[i + 1];
        }

         String longestPrefix = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (prefix[i].equals(suffix[s.length() - 1 - i])) {
                longestPrefix = prefix[i];
            }
        }

        return longestPrefix;
    }     
}