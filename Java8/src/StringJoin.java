import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("1","2","3","4");
        String result = String.join("-",str);
        System.out.println(result);
    }
}
