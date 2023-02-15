package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        System.out.println(switch (month) {
            case 1, 3, 5, 6, 8, 10, 12 -> 31;
            case 4, 7, 9, 11 -> 30;
            case 2 -> year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
            default -> "invalid date";
        });
    }
}
