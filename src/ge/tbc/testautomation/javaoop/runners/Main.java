package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args){
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
    }
}
