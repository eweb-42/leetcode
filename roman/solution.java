package roman;

import java.util.Map;
import java.util.HashMap;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

public class solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    private static int romanToInt(String s) {
        Map<String, Integer> m = new HashMap<>();
        int res = 0;
        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);
        for (int i = 0; i < s.length(); i++) {
            String cur = String.valueOf(s.charAt(i));
            String next = String.valueOf(s.charAt(i+1));
            System.out.println(i<s.length());
            if(i < s.length() && cur.equals("I") && next.equals("V")) {
                res = res + 5;
            } else {
                res = res + m.get(cur);
            }
        }
        return res;        
    } 
}
