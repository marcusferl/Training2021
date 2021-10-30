
public class SecondsToTime {
    public static void main(String[] args) {
        long seconds = 30067;
        
        String format = String.format("%%0%dd", 2);
        long elapsedTime = seconds;
        String secondss = String.format(format, elapsedTime % 60);
        String minutes = String.format(format, (elapsedTime % 3600) / 60);
        String hours = String.format(format, elapsedTime / 3600);
        String time =  hours + ":" + minutes + ":" + secondss;

        System.out.println(time);
        
    }
}
