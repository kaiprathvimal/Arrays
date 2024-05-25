import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StartingWith1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12,2,3,12,22,11,134,132);
        nums.stream()
                .map(s ->s + "")
                .filter(s ->s.startsWith("1"))
                .forEach(System.out::println);
        List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6);
        nums1.stream()
                .filter(s -> s%2 ==0)
                .forEach(System.out::println);
        // find the count of repeating characters
        String input = "ilovejavateche";
        Map<String,Long> names =Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(names);
        //print the character that are repeating
        String input1 = "ilovejavateche";
       List<String> list1= Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(list1);

        int number = 2345;
        int reversedNumber = Integer.parseInt(
                new StringBuilder(String.valueOf(number))
                        .reverse()
                        .toString()
        );
        System.out.println(reversedNumber);
        //print the character that are not repeating
        String input2 = "ilovejavateche";
        Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue() == 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::print);
        //print the character that are  repeating more that2
        String input3 = "ilovejavateche";
        Arrays.stream(input3.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue()>2)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
        //print the character that are  repeating most
        String input4 = "ilovejavateche";
        List<String>list5=Arrays.stream(input4.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream().collect(Collectors.toList());
        System.out.println(list5);

        //repeating character
        String  s= "Best Better";
        Map<String,Long> s1= Arrays.stream(s.split(""))
                .filter(str ->!str.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(s1);
//firstrepeating character
        String  str= "Best Better";
        String str2=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue()>1)
                .findFirst().get().getKey();
        System.out.println(str2);
        //sorting number
        int[] arr = {2,443,22,421,23};
        Arrays.stream(arr).sorted().forEach(System.out::println);
        //Highest number
        int[] arr1= {1234567};
        Integer intA=Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(intA);





    }
}
