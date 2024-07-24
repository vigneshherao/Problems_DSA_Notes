package Strings;

public class RomanInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            int value = 0;
            if (curr == 'I') {
                value = 1;
            } else if (curr == 'V') {
                value = 5;
            } else if (curr == 'X') {
                value = 10;
            } else if (curr == 'L') {
                value = 50;
            } else if (curr == 'C') {
                value = 100;
            } else if (curr == 'D') {
                value = 500;
            } else {
                value = 1000;
            }
            if (i + 1 < n) {
                char next = s.charAt(i + 1);
                int nextValue = 0;

                if (next == 'I') {
                    nextValue = 1;
                } else if (next == 'V') {
                    nextValue = 5;
                } else if (next == 'X') {
                    nextValue = 10;
                } else if (next == 'L') {
                    nextValue = 50;
                } else if (next == 'C') {
                    nextValue = 100;
                } else if (next == 'D') {
                    nextValue = 500;
                } else {
                    nextValue = 1000;
                }
                if (value < nextValue) {
                    count -= value;
                } else {
                    count += value;
                }
            } else {
                count += value;
            }
        }


        System.out.println(count);
    }
}
