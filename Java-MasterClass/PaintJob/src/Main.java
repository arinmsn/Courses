public class Main {
    public static void main(String[] args) {
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5,2)); // -1
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5,2)); // 3
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1)); // 3
        System.out.println("---");
    }
}
