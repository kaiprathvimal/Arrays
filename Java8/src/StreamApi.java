import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,3,6,7,8,9);
        Function<Integer,Integer> func = n -> n*2;
        Integer reduce = list.stream()
                .filter(n -> n % 2 == 1)
                .sorted()
                .map(func)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
