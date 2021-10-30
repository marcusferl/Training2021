public class UpdateLightGreenYellowRed {
    public static void main(String[] args) {
        updateLight("green");
    }
    public static String updateLight(String current) {

        String updateLight = "";

        switch(current){
            case "green":
            updateLight = "yellow";
            break;
            case "yellow":
            updateLight = "red";
            break;
            case "red":
            updateLight = "green";
        }
        System.out.println(updateLight);
        return updateLight;
         
        }
}
