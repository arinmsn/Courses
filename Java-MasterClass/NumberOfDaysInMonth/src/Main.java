public class Main {
    public static void main(String[] args) {
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600)); // false
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600)); // true
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017)); // false
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000)); // true
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020)); // 31
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020)); // 29
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018)); // 28
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020)); // -1
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020)); // -1
    }
}
