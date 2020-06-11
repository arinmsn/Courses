public class Main {
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(1, 0,4)); // false
        System.out.println(FlourPacker.canPack(0,2,5)); // false
        System.out.println(FlourPacker.canPack(1,0,5)); // true
        System.out.println(FlourPacker.canPack(0,5,4)); // true
        System.out.println(FlourPacker.canPack(2,2,11)); // true
        System.out.println(FlourPacker.canPack(-3, 2, 12)); // false
        System.out.println(FlourPacker.canPack(2, 1, 5)); // true
    }
}
