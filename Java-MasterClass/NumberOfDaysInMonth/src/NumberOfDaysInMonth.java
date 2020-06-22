public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year){

        if ( (year >= 1) && (year <= 9999)) {
            return ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) );
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year){


        if ( (month < 1) || (month > 12)){
            return -1;
        }

        if ( (year < 1) || (year > 9999) ){
            return -1;
        }


        int daysInMonth;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            // For leap year, Feb has 29 days
            case 2:
                if (isLeapYear(year)){
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 0;
                break;
        }
        return daysInMonth;
    } // end of getDayInMonth()

}
