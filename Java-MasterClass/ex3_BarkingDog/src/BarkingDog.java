public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay ){

        if ( (!isBarking) || (hourOfDay < 0) || (hourOfDay > 23)){
            return false;
        } else if ( (isBarking) && ((hourOfDay < 8) || (hourOfDay > 22) )) {
            return true;
        } else return false;
    }

}
