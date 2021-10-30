import java.util.Arrays;

public class PhoneNumper {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(createPhoneNumber(test));
    }

    public static String createPhoneNumber(int[] numbers) {

        String nums = Arrays.toString(numbers).replaceAll(",\\s", "").replaceAll("\\[", "").replaceAll("\\]", "");

        StringBuilder str = new StringBuilder(nums);

        str.insert(0, '(');
        str.insert(4, ')');
        str.insert(5, ' ');
        str.insert(9, '-');

        nums = str.toString();
        return nums; // Your code here!
    }


    //Easy Way
    public static String createPhoneNumberV2(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");
        
        for (int i : numbers) {
          phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        
        return phoneNumber;
      }
}
