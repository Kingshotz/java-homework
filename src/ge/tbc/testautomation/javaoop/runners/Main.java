package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        /*------------------ Java-oop 1--------------------*/
        Random rand = new Random();

        Circle c1 = new Circle(rand.nextDouble()*49+1);
        System.out.println(Circle.numberOfCircleInstances);
        Circle c2 = new Circle(rand.nextDouble()*49+1);
        System.out.println(Circle.numberOfCircleInstances);
        Circle c3 = new Circle(rand.nextDouble()*49+1);
        System.out.println(Circle.numberOfCircleInstances);
        Circle c4 = new Circle(rand.nextDouble()*49+1);
        System.out.println(Circle.numberOfCircleInstances);
        Circle c5 = new Circle(rand.nextDouble()*49+1);
        System.out.println(Circle.numberOfCircleInstances);

        System.out.println(Util.circleToString(c1));
        System.out.println(Util.circleToString(c2));
        System.out.println(Util.circleToString(c3));
        System.out.println(Util.circleToString(c4));
        System.out.println(Util.circleToString(c5));


        /*-------------------java-OOP-2 ---------------------------*/
        Rectangle rect = new Rectangle(5, 7);
        Rectangle rectTwo = new Rectangle(3,4);
        System.out.println(rect.getArea());//must be 35
        System.out.println(rect.getPerimeter());
        HelperFunctions.compareRectangles(rect, rectTwo);
        try{
            Rectangle rectErr = new Rectangle(-2 , 5);

        }catch (Exception e){
            System.out.println("Cannot create rectangle with negative sides");
        }

        Triangle tri = new Triangle(3, 4, 5, 4); // a=3, b=4, c=5, h=4
        Triangle triTwo = new Triangle(5, 5, 5, 4.33);

        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());
        try {
            Triangle triErr = new Triangle(-3, 4, 5, 2);
        } catch (Exception e) {
            System.out.println("Cannot create triangle with negative sides");
        }


    }
}
