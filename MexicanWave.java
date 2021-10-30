public class MexicanWave {


    // Let the UpperCase char move
    public static void main(String[] args) {
        wave("hello how are you");
    }
    public static String[] wave(String str) {
        
        String [] wave = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char [] charArray = str.toCharArray();

            if(charArray[i] == ' ') continue;

            charArray[i] = Character.toUpperCase(charArray[i]);
            wave[i] = String.valueOf(charArray);
            System.out.println(wave[i]);
        }


        return wave;
}
}
