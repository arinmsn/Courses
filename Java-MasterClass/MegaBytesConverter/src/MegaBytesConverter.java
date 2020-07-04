public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            // 1 MB = 1024 KB
            int megabytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            String result = (kiloBytes + " KB = " + megabytes + " MB" + " and " + remainingKiloBytes + " KB");
            System.out.println(result);
        }
    }
}