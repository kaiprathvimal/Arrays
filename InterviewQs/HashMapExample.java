package InterviewQs;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        String input = "This this is is done by Saket Saket";
        Map<Character,Integer> charMap = countCharStr(input);
        for(Map.Entry<Character,Integer> entry : charMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<Character,Integer> countCharStr(String str) {
        Map<Character,Integer> charCountMap = new HashMap<>();
        for (char c :str.toCharArray()) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }else  {
                charCountMap.put(c,1);
            }

        }
        return charCountMap;
    }
}

