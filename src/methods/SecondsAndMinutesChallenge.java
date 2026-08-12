package methods;
public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    // Prva metoda
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int fullMinute = seconds / 60;
        int restSeconds = seconds % 60;
        return getDurationString(fullMinute, restSeconds);
    }

    // Druga metoda
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid value";
        }
        if (seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hour + "h " + remainingMinutes + "m " + seconds + "s";
    }
}