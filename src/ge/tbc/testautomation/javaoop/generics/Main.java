package ge.tbc.testautomation.javaoop.generics;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Triangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static  <K,D> AnyPair<Field[],Field[]> getDeclaredFields (K objOne, D objTwo){
        Field[] objOneFields = objOne.getClass().getDeclaredFields();
        Field[] objTwoFields = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(objOneFields, objTwoFields);
    }
    public static void main(String[] args) {
        Integer integer = 200;
        String str = "String";
        AnyPair<Field[],Field[]>  integerStringAnyPair = getDeclaredFields(integer, str);

        System.out.println("\n-----------------Integer Fields---------------------------------\n");
        Arrays.asList(integerStringAnyPair.getElementOne()).forEach(field -> System.out.println(field+"\n"));

        System.out.println("\n-------------------------String Fields------------------------------\n");
        Arrays.asList(integerStringAnyPair.getElementTwo()).forEach(field -> System.out.println(field+"\n"));

        System.out.println("\n--------------------------------------------------\n");

        Circle circ = new Circle(15);
        //Rectangle.java washlili mak da memgoni triangleze ar ikneba problema
        Triangle triangle = new Triangle(5, 6, 9);
        FigurePair<Circle, Triangle> figurePair = new FigurePair<>(circ, triangle);
        System.out.println(figurePair);
    }
}
