package ge.tbc.testautomation.javaoop.Comparators;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.Comparator;

public class RectanglesReverseComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        return Double.compare(o2.getArea(),o1.getArea());
    }
}
