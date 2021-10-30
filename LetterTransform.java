public class LetterTransform {

    public static void main(String[] args) {
        transformedLetters("house");
    }

    public static String transformedLetters(String word) {

        String temp = word.toLowerCase();
        String replaceAtoM = temp.replaceAll("[a-m]", "0");
        String replaceFinal = replaceAtoM.replaceAll("[n-z]", "1");

        System.out.println(replaceFinal);

        return replaceFinal;
    }
}
