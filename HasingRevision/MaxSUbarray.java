package HasingRevision;

import java.util.HashSet;

public class MaxSUbarray {
    public static void main(String[] args) {
        String s ="abcabcbb";
        Sol sol = new Sol();
        System.out.println(sol.maxS(s));

    }
}
class Sol {
    public int maxS(String s) {
        int n = s.length();
        int maxLenght = 0;
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        for(int right =0; right < n ;right++) {
            if(!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLenght = Math.max(maxLenght, right - left +1 );
            } else {
                while(charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        return maxLenght;
    }
}