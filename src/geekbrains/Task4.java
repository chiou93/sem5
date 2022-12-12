package geekbrains;


import java.util.HashMap;

public class Task4 {
    class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> roman = new HashMap<>();
            roman.put('I', 1);
            roman.put('V', 5);
            roman.put('X', 10);
            roman.put('L', 50);
            roman.put('C', 100);
            roman.put('D', 500);
            roman.put('M', 1000);

            int sum = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))) {
                    sum = sum + roman.get(s.charAt(i));
                } else {
                    sum = sum - roman.get(s.charAt(i));
                }
            }
            return sum + roman.get(s.charAt(s.length() - 1));
        }
    }
}


/*public class Task4 {
    public static void main(String[] args) {
        String character = "MCMXXXV";
        System.out.println(romanToInt(character));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res = res - roman.get(s.charAt(i));
            }
            else {
                res = res + roman.get(s.charAt(i));
            }
        }
        return res + roman.get(s.charAt(s.length() - 1));
    }
}
*/