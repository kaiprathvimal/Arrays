import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWith {
    public static void main(String[] args) {
        int[] number = {1,2,11,21,12,123,32};
       List<String> startsWith = Arrays.stream(number).boxed()
               .map(s-> s + "")
               .filter(s -> s.startsWith("1"))
               .collect(Collectors.toList());
        System.out.println(startsWith);
    }


}


