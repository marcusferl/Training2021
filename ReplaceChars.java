public class ReplaceChars {
    
    public static void main(String[] args) {
        
        String word = "Hello";

        StringBuilder sb = new StringBuilder(word);

        
        sb.deleteCharAt(word.length() -1);

        // Delete first Char at end!
        sb.deleteCharAt(0);

        String replacedWord = sb.toString();

        System.out.println(replacedWord);

    }
}
