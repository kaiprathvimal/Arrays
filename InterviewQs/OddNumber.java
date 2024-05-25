package InterviewQs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumber {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,3,4,6,23,4,56);
        List<Integer> squreOf = input.stream().filter(x -> x%2!=0).map(x -> x*x).toList();
        System.out.println(squreOf);
    }
}
