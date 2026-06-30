package ge.tbc.testautomation.javaoop.figures;

public class Circle {
    private double radius;
    public static int numberOfCircleInstances = 0;
    public Circle(double radius){
        this.setRadius(radius);
        numberOfCircleInstances++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            throw new IllegalArgumentException("Radius must be positive");
        }else {
            this.radius = radius;
        }
    }
}
