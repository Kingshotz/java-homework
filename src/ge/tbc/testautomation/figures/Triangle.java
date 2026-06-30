package ge.tbc.testautomation.figures;

public class Triangle  extends Figure{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c , double h) {
        if(a<=0 || b<=0 || c<=0|| h<=0) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        //vigulisxmot ro h a-ze dashvebuli simaglea
        return a*h/2;
    }
}
