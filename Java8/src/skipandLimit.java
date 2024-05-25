import java.util.stream.IntStream;

public class skipandLimit {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(n -> System.out.println(n));

    }
}
