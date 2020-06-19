public class Main {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(3,4));
        System.out.println(area(0,-4));
        System.out.println(area(0,0));
        System.out.println(area(-2));

    }

    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        double area = radius * radius * Math.PI;
        return area;
    }

    public static double area(double x, double y){
        if ( (x < 0) || (y < 0)){
            return -1.0;
        }
        double area = x * y;
        return area;
    }
}
