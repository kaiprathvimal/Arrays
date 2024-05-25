import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        String[] strArry = {"vimal","kamalesh","rupeshjii","yaaringdhaporampok"};
        String s = Arrays.stream(strArry)
                .reduce((a,b) -> a.length() > b.length()?a:b)
                .get();
        System.out.println(s);
    }
}
