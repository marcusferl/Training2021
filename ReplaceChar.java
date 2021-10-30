public class ReplaceChar {
    public static void main(String[] args) {
        System.out.println(makeComplement("agtc"));
    }

    public static String makeComplement(String dna) {
        String dnaUpper = dna.toUpperCase();
        char dnaChar[] = dnaUpper.toCharArray();

        for (int i = 0; i < dnaChar.length; i++) {
            switch (dnaChar[i]) {
            case 'A':
                dnaChar[i] = 'T';
                break;
            case 'T':
                dnaChar[i] = 'A';
                break;
            case 'C':
                dnaChar[i] = 'G';
                break;
            case 'G':
                dnaChar[i] = 'C';
                break;
            }

        }
        return String.valueOf(dnaChar);

    }
}
