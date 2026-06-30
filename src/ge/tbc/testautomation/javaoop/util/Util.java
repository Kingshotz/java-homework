package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Util {
    public static String circleToString(Circle circle){
        //radgan varandomeb radiuss da cudi wasakitxi ar ikos  2 cifrs davtoveb mdzimis shemdeg
        return String.format("[Circle: radius - %.2f]", circle.getRadius());
    }
}
