import java.util.Arrays;
import java.util.Collections;

public class HighestAndLowestN {
    public static void main(String[] args) {
        highAndLow("1 2 3 4 -3 6 -9");
    }

    public static String highAndLow(String numbers) {
        String numsToArray[] = numbers.split(" ");
        Integer arr[] = new Integer[numsToArray.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(numsToArray[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(arr[0] + " " + arr[arr.length - 1]);

        return arr[0] + " " + arr[arr.length - 1];
    }
}
