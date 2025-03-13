public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int testYear = 2024;
        System.out.println(testYear + " jest rokiem przestępnym? " + isLeapYear(testYear));
    }
}

