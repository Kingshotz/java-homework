package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.Figure;

public class Rectangle  extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if(a<=0 || b<= 0) throw new IllegalArgumentException("Invalid Rectangle!");
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

    @Override
    public void printPackageName() {
        String pkg = this.getClass().getPackageName();
        System.out.println(pkg.isEmpty() ? "default package" : pkg);
    }

    @Override
    public String toString() {
        return "Rectangle{area: "+this.getArea();
    }
}
