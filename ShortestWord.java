import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
       System.out.println(findShort("Hallo du Mensch")); 
    }
    // My Way
    public static int findShort(String s) {
       
        String [] wordArr = s.split(" ");

        Arrays.sort(wordArr, Comparator.comparing(String::length));


        
        return wordArr[0].length();
    }

    //Faster way
    public static int findShortV2(String s) {
        return Stream.of(s.split(" "))
          .mapToInt(String::length)
          .min()
          .getAsInt();
    }
}
