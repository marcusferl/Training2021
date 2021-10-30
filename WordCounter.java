
/**
 * Main
 */
public class WordCounter {

    public static void main(String[] args) {
        countWords("Hallo wie gehts");
    }

    public static int countWords(String s) {

        String array[] = s.split(" ");

        for (var temp : array) {
            System.out.println(temp);

        }
        int counter = array.length;
        return counter;
    }
}