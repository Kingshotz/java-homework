package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;
import ge.tbc.testautomation.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {
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
