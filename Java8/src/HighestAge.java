import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestAge {
    public static void main(String[] args) {
        List<Integer> age = Arrays.asList(20,22,34);
             Optional<Integer> ages =    age.stream()
                        .max(Integer::compareTo);
        System.out.println(ages.get());

    }
}
