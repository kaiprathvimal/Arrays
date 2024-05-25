import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyingValue {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,3,4,5);
             List<Integer> list =       nums.stream()
                            .map(x -> x*2)
                            .collect(Collectors.toList());
        System.out.println(list);


    }
}
