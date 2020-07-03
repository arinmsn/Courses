public class Main {
    public static void main(String[] args) {
        System.out.println("Following should not be leap years:");
        LeapYearCalculator.isLeapYear(1700);
        LeapYearCalculator.isLeapYear(1800);
        LeapYearCalculator.isLeapYear(1900);
        LeapYearCalculator.isLeapYear(2100);
        LeapYearCalculator.isLeapYear(2300);
        LeapYearCalculator.isLeapYear(2500);
        LeapYearCalculator.isLeapYear(2600);
        System.out.println("----- End of NOT leap years -----");
        System.out.println("Following should be leap years:");
        LeapYearCalculator.isLeapYear(1600);
        LeapYearCalculator.isLeapYear(2000);
        LeapYearCalculator.isLeapYear(2400);
    }
}
