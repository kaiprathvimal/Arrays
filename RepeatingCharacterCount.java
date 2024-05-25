import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterCount {
    public static void main(String[] args) {
        String s = "aaabbbsss";
        Solutions sol = new Solutions();
        sol.repeatingCount(s);
    }
}

class Solutions {
    public void repeatingCount(String s) {
       int n =s.length();
       Map<Character,Integer> charMap = new HashMap<>();
       for(int i =0; i<n;i++) {
           char c = s.charAt(i);
           charMap.put(c,charMap.getOrDefault(c,0)+ 1);
       }
       for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
           System.out.println(entry.getKey() + ":" + entry.getValue() );
       }

    }

}
