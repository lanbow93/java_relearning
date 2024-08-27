public class App {
    public static void main(String[] args) throws Exception {
        ;
        System.out.println(getDurationString(5000));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(24));
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Seconds Provided";
        }
        int convertedMinutes = (int) Math.floor(seconds / 60);
        int remainingSeconds = seconds % 60;

        return getDurationString(convertedMinutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = (int) Math.floor(minutes/60);
        int remainingMinutes = minutes % 60;
        return  hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
}
