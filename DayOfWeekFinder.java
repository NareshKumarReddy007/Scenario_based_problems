//Given a date (day, month, year), the task is to determine the day of the week on which that date falls. The function should be able to compute the day for any date in the past or future. 
//The function should return values from 0 to 6 where 0 means Sunday, 1 Monday and so on.
import java.time.*;

class DayOfWeekFinder {
    static int dayOfWeek(int day, int month, int year) {
        // Create LocalDate object
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // Convert to numeric form: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        int value = dayOfWeek.getValue(); // returns 1 (Monday) to 7 (Sunday)
        // Adjust so 0 = Sunday
        return value % 7;
    }
    public static void main(String[] args) {
        int day = 8, month = 11, year = 2025;
        int result = dayOfWeek(day, month, year);
        System.out.println("Day of week: " + result);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("That is a " + days[result]);
    }
}
