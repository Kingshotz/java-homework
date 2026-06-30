package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends  Figure {
    private double a;
    private double b;
    public Rectangle(double a, double b){
        if(a<=0 || b<=0) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }
}
