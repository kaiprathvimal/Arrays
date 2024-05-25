import java.util.Arrays;
import java.util.stream.Collectors;

public class StringWithoutSpaces {
    public static void main(String[] args) {
        String input = "My Name is Vimal 232ei23@@@@@@!@";
        String input1=input.chars().filter(Character::isLetter).filter(Character::isLowerCase).mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
        System.out.println(input1);
    }


}
