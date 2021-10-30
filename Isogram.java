import java.util.Arrays;

public class Isogram {
    // Isogram is a word that has no repeating letters

    public static void main(String[] args) {
        System.out.println(isIsogram("aba"));
    }
    public static boolean  isIsogram(String str) {

        str = str.toLowerCase();

        char strArr [] = str.toCharArray();

        Arrays.sort(strArr);

        for(int i = 0; i < strArr.length - 1; i++){
            if(strArr[i] == strArr[i + 1])
            return false;
        }
       return true;
    } 

}
