public class leapYear {
        public static boolean isLeapYear(int year) {
            if (year % 4 == 0){
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            int testYear = 1000;
            System.out.println(testYear + " jest rokiem przestepnym? " + isLeapYear(testYear));
        }
    }

