public class Circle {
    private double radius;

    public Circle(double radius){
        if (this.radius < 0){
            this.radius = 0;
        } else {
          this.radius = radius;  
        }
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }
}