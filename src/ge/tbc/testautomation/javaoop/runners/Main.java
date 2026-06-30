package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.javaoop.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        /*------------------ Java-oop 1--------------------
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
        ---------------END----------------------------*/

        /*-------------------java-OOP-2 ---------------------------
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
        --------------------------END-----------------------------------*/
        try{
            Circle circ1 = new Circle(-1);
        }catch (RadiusException e){
            System.out.println(e.getMessage());
        }
        Circle circ2 = new Circle(5);
        Circle circ3 = new Circle(5);
        Circle circ4 = new Circle(5);
        Circle circ5 = new Circle(5);
        try{
            Circle circ6 = new Circle(8.5);
        }catch (LimitException e){
            System.out.println(e.getMessage());
        }

        String str = "Test Automation Bootcamp 12, 2025";
        //sitkva automation modzebna da bechdva
        String automation = str.substring(str.indexOf("Automation"), str.indexOf("Automation")+"Automation".length()).toLowerCase();
        System.out.println(automation);
        //xazebad bechdva, radgan sitkvebio chavtvale ro mdzimec unda mogveshorebia
        String words = str.replace(",", "").replace(" ", "\n");
        System.out.println(words);
        //sigrdzis danechdva
        System.out.printf("Length: %d \n", str.length());
        //tireeebit bechdva, mdzime akac movashore
        String withLine = str.replace(",", "").replace(" ", "-");
        System.out.println(withLine);

        //nomrebi
        String[] numbers = {
                "599-14-15-16",
                "555-12-34-56",
                "592-11-22-33",
                "123-45-67-89",
                "595-00-00-00",
                "598-11-11-11"
        };
        for(String number : numbers){
            String cleaned = number.replace("-","");
            if(phoneNumberValidation(cleaned)){
                System.out.printf("Phone Number : %s is Valid! \n", number);
            }else{
                System.out.printf("Phone Number : %s is InValid! \n", number);
            }
        }
    }

    private static boolean phoneNumberValidation(String phoneNumber){
        String regex =  "^(555|595|592|599)[0-9]{6}$";
        return Pattern.matches(regex, phoneNumber.strip());
    }
}
