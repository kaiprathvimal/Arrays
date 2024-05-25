import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RevisionStreamApi {
    public static void main(String[] args) {
        // find the count of repeating characters
        String input = "ilovejavateche";
        Map<String,Long> map =Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        //print the character that are repeating
        List<String> str = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(str);
        //Not repeating
        List<String> str1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(str1);
        //most repeating
        List<String> str3 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream().collect(Collectors.toList());
        System.out.println(str3);
        //least repeating
        List<String> str4 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream().collect(Collectors.toList());
        System.out.println(str4);
        //first repeating
        String input1 = "abccabxsjsuns";
        String str5 = Arrays.stream(input1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue()>1)
                .findFirst().get().getKey();
        System.out.println(str5);

        //sorting number
        int[] arr = {2,443,22,421,23};
        List<Integer> intarry = Arrays.stream(arr).boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(intarry);

        //remove second-highest number
         Integer inaArry = Arrays.stream(arr).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(inaArry);
        //number starting with 2
        List<String> arryitr = Arrays.stream(arr).boxed()
                        .map(s -> s + "")
                        .filter(s -> s.startsWith("2"))
                        .collect(Collectors.toList());
        System.out.println(arryitr);

        //highest string
        String[] strArry = {"vimal","kamalesh","rupeshjii","yaaringdhaporampok"};
        List<String> sub = Arrays.stream(strArry)
                .reduce((a,b) -> a.length()>b.length()?a:b)
                .stream()
                .collect(Collectors.toList());
        System.out.println(sub);
    //string join
        List<String> str10 = Arrays.asList("1","2","3","4");
        String resu = String.join("-",str10);
        System.out.println(resu);




    }
}
