import java.util.HashMap;
import java.util.Map;

public class CountDisplay {
    public static void main(String[] args) {
        String a ="best  better";
        Map<Character,Integer> countRepeat = new HashMap<>();
        for(int i =0; i<a.length();i++) {
            char c = a.charAt(i);
            countRepeat.put(c,countRepeat.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> entry : countRepeat.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
