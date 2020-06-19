public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        // bigCount = 5 kilos flour bags
        // smallCount = 1 kilo flour bag

        int bigKilo = 5;
        int count = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        if (bigCount <= (goal/5)){
            while (count <= bigCount) {
                if ((bigKilo * count + smallCount) >= goal){
                    return true;
                }
                count++;
            }
        } else {
            while (count <= (goal/5)){
                if ((bigKilo * count + smallCount) >= goal){
                    return true;
                }
                count++;
            }
        }
        return false;
    }
}
