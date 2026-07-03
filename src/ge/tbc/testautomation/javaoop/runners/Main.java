package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){

        System.out.println("--------Circle Tests-------------");
        System.out.println(" ");
        Circle circle1 = new Circle(5);
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(" ");

        System.out.println("--- After doubleSize ---");
        circle1.doubleSize();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(" ");

        System.out.println("--- after CustomSize byValue: 4 (reseting to original)------");
        circle1.customSize(0.5);
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println(" ");

        System.out.println("-------package Name--------");
        circle1.printPackageName();
        System.out.println(" ");

        try{
            Circle invalidCircle = new Circle(-3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(" ");


        System.out.println("\n========== TRIANGLE TESTS ==========");

        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println(triangle1);
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println(" ");

        System.out.println("--- After doubleSize ---");
        triangle1.doubleSize();
        System.out.println(triangle1);
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println(" ");

        System.out.println("--- after CustomSize byValue : 4------");
        triangle1.customSize(4);
        System.out.println(triangle1);
        System.out.println("Area: " + triangle1.getArea());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println(" ");

        System.out.println("-------package Name--------");
        triangle1.printPackageName();
        System.out.println(" ");

        try {
            Triangle negativeTriangle = new Triangle(-1, 2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Triangle invalidTriangle = new Triangle(1, 2, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Triangle degenerateTriangle = new Triangle(1, 2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //added another triangle check
        try {
            Triangle degenerateTriangle = new Triangle(8, -2, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n Some Line from abstractClassesInferfaces");
    }
}
