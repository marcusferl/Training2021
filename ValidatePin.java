public class ValidatePin {
    public static void main(String[] args) {
        System.out.println(validatePin(".234"));
    }

    public static boolean validatePin(String pin) {
        boolean pinCheck = true;
        String pinReplace = pin.replaceAll("([a-zA-Z, .])", "");

        switch (pinReplace.length()) {
        case 4:
            pinCheck = true;
            break;
        case 6:
            pinCheck = true;
            break;
        default:
            pinCheck = false;
            break;
        }
        return pinCheck;
    }
}

//Still doesnt work right e.g with 1.234, cuz of the Point 