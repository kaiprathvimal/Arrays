import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LastTime {
    public static void main(String[] args) {
        String s = "Best Better";
        Map<String, Long> str = Arrays.stream(s.split(""))
                .filter(x -> !x.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(str);

        // //print the character that are repeating
        String input = "ilovejavateche";
        List<String> str1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).stream().collect(Collectors.toList());
        System.out.println(str1);
        List<Integer> nums = Arrays.asList(12, 2, 3, 12, 22, 11, 134, 132);
        nums.stream().sorted().forEach(System.out::println);
        List<Integer> nums1 = Arrays.asList(12, 2, 3, 12, 22, 11, 134, 132);
        nums1.stream().map(n -> n + " ")
                .filter(n -> n.startsWith("1")).forEach(System.out::print);

        //Remove Second Highest number
        List<Integer> nums2 = Arrays.asList(12, 2, 3, 12, 22, 11, 134, 132);
        Integer nn= nums2.stream().max(Integer::compareTo).orElse(null);
        System.out.println(nn);

        //highest string
        String[] strArry = {"vimal","kamalesh","rupeshjii","yaaringdhaporampok"};
        List<String> sss=Arrays.stream(strArry).reduce((a,b) -> a.length()>b.length() ? a :b).stream().collect(Collectors.toList());
        System.out.println(sss);
    }
}
