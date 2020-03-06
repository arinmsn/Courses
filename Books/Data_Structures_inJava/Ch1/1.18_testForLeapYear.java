// Write a static method that takes a year as a parameter
// and returns strue if the year is a leap year,
// and false otherwise.
// Using Division: Given year is a leap year if
// it is evenly divisalbe by 4 & (not evenly divisiable by 100)

// One implementation
// CPU Time: 0.28 sec(s), Memory: 33296 kilobyte(s)
public class determineLeapYear {
    public static void main(String[] args) {
        int year = 2016; // 2016 is a leap year
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
