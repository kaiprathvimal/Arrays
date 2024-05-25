package InterviewQs;

import java.util.stream.Collectors;

public class DisplayOnlyCHaracter {
    //From the given string display only alphabetic character, ignore all other
    public static void main(String[] args) {
        String str ="Best time to Buy 234 kg Oil will be on 20/05/24";
        //Use java8
        String strNew = str.chars()   // convert to character
                .filter(Character::isAlphabetic)//filter each character by letter using method reference
                .mapToObj(x -> String.valueOf((char) x)) // map the filtered character
                .collect(Collectors.joining()); // collect
        System.out.println(strNew);
    }
}
