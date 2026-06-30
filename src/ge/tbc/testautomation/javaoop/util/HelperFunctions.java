package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle rectOne, Rectangle rectTwo){
        char c;
        if(rectOne.getPerimeter() > rectTwo.getPerimeter()){
            c = '>';
        }else if(rectOne.getPerimeter() < rectTwo.getPerimeter()){
            c = '<';
        }else{
            c = '=';
        }
        System.out.printf("parameter 1 %c parameter 2%n", c);
    }
}
