public class Wall {
    private double width;
    private double height;

    public Wall() {
        //
    }

    public Wall(double width, double height) {

        if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else if (width < 0){
            this.height = height;
            this.width = 0;
        } else if (height < 0) {
            this.width = width;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0 ) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return getWidth() * getHeight();
    }
}
