import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("vimal","amal","kamal");
        //values.forEach(s -> System.out.println(s));
        values.forEach(System.out::println);
    }
}
