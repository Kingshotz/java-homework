package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.Figure;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.IResizable;
import ge.tbc.testautomation.javaoop.abstractClassesInterfaces.IValidFigure;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;

public class Circle  extends Figure implements IResizable, IValidFigure, Comparable<Circle> {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        if(!this.validateFigure()){
            throw new IllegalArgumentException(this.toString() + " is not valid and can't be created");
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(!this.validateFigure()){
            throw new IllegalArgumentException(String.format("Radius: %f is not valid and can't be set",radius));
        }
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public void printPackageName() {
        String pkg = this.getClass().getPackageName();
        System.out.println(pkg.isEmpty() ? "default package" : pkg);
    }

    @Override
    public void doubleSize() {
        //fartobs gauormagebs
        this.radius = radius*Math.sqrt(2);
    }

    @Override
    public void customSize(double byValue) {
        if(byValue<=0)
            throw new IllegalArgumentException("you can't make circle size negative!");
        this.radius = radius*Math.sqrt(byValue);
    }

    @Override
    public boolean validateFigure() {
        return radius>0;
    }

    @Override
    public String toString() {
        return String.format("Circle [Radius: %f]", this.radius);
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }
}
