package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.Figure;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.IValidFigure;

public class Triangle  extends Figure implements IResizable, IValidFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c ) {
        this.a = a;
        this.b = b;
        this.c = c;
        if(!this.validateFigure()){
            throw new IllegalArgumentException(this.toString() + " is not valid and can't be created");
        }
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public void printPackageName() {
        String pkg = this.getClass().getPackageName();
        System.out.println(pkg.isEmpty() ? "default package" : pkg);
    }

    @Override
    public double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void doubleSize() {
        double coefficient = Math.sqrt(2);
        this.a = this.a*coefficient;
        this.b = this.b*coefficient;
        this.c = this.c*coefficient;
    }

    @Override
    public void customSize(double byValue) {
        double coefficient = Math.sqrt(byValue);
        this.a = this.a*coefficient;
        this.b = this.b*coefficient;
        this.c = this.c*coefficient;
    }

    @Override
    public boolean validateFigure() {
        if(a<=0 || b<=0 || c<=0) return false;
        double maxSide = Math.max(Math.max(a,b), c);
        return maxSide<a+b+c-maxSide;
    }

    @Override
    public String toString() {
        return String.format("triangle[a: %f,b: %f, c: %f]",a,b,c);
    }
}
