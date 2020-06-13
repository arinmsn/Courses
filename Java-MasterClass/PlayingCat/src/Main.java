public class Main {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
        System.out.println(isCatPlaying(false, -5)); // false
    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        if (summer) {
            if (temperature >= 25 && temperature <= 45){
                return true;
            } else {
                return false;
            }
        } else if (temperature >= 25 && temperature <= 35){
            return true;
        } else {
            return false;
        }

    }

//    public class PlayingCat {
//
//    }
}
