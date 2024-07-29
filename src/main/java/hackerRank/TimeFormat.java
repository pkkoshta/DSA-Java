package hackerRank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Map;

public class TimeFormat {
    public static void main(String[] args) {
        String time12Hour = "12:00:00AM";
        String time24H = "";
        DateTimeFormatter formatter12Hour = DateTimeFormatter.ofPattern("hh:mm:ssa");
        // Adjust for midnight (12:00:00AM)
        if (time12Hour.equals("12:00:00AM")) {
            time24H = "00:00:00";
        }
        LocalTime time = LocalTime.parse(time12Hour, formatter12Hour);

        // Format the time in 24-hour format
        DateTimeFormatter formatter24Hour = DateTimeFormatter.ofPattern("HH:mm:ss");
         time24H = time.format(formatter24Hour);

        // Print the result
        System.out.println("Time in 24-hour format: " + time24H);
    }
}
