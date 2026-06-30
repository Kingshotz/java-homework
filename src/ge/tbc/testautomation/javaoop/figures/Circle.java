package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;

public class Circle  extends Figure{
    private double radius;
    public static int numberOfCircleInstances = 0;
    public Circle(double radius){
        if(Figure.numberOfInstances>5){
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        //setershi gavakete checki
        this.setRadius(radius);
        numberOfCircleInstances++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }else {
            this.radius = radius;
        }
    }
}
