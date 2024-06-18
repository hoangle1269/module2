public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        // Số ngày trong mỗi tháng
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Kiểm tra năm nhuận
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        nextDay++;

        if (nextDay > daysInMonth[month - 1]) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }
}
