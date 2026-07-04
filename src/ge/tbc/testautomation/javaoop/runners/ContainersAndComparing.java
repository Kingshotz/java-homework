package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.Comparators.RectanglesReverseComparator;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.util.*;

public class ContainersAndComparing {
    static void main(String[] args) {
        List<String> phoneNumbers = List.of("555-542-231", "555-887-987", "555-161-143", "555-189-6667");
        Iterator<String> pnIterator =  phoneNumbers.iterator();
        while(pnIterator.hasNext()){
            System.out.println(pnIterator.next());
        }

        List<String> names = List.of("giorgi", "shota", "ana", "nini");
        Map<String, String> namesToPn = new HashMap<>();
        for (int i=0;i<phoneNumbers.size();i++){
            namesToPn.put(names.get(i), phoneNumbers.get(i));
        }

        System.out.println("\nPrinting numbers which contains 8");
        for(String key : namesToPn.keySet()){
            if(namesToPn.get(key).contains("8")){
                System.out.println( namesToPn.get(key));
            }
        }

        System.out.println("\n-------------printing treeset of circles-------------------");
        Set<Circle> circles = new TreeSet<>();
        Random rand = new Random();
        for (int i=0;i<7;i++){
            circles.add(new Circle(rand.nextDouble()*20));
        }
        for(int i=0;i<3;i++){
            circles.add(new Circle(3));
        }
        System.out.println(circles);

        System.out.println("\n------------printing hashSet of circles----------------");
        Set<Circle> circlesHashSet = new HashSet<>();
        for (int i=0;i<7;i++){
            circlesHashSet.add(new Circle(rand.nextDouble()*20));
        }
        for(int i=0;i<3;i++){
            circlesHashSet.add(new Circle(3));
        }
        System.out.println(circlesHashSet);

        System.out.println("\n--------- printing rectangles---------------");
        List<Rectangle> rectangles = new ArrayList<>();
        for(int i=0;i<10;i++){
            rectangles.add(new Rectangle(rand.nextDouble()*10, rand.nextDouble()*10 ));
        }
        System.out.println("Before sorting");
        System.out.println(rectangles);
        rectangles.sort(new RectanglesReverseComparator());
        System.out.println("After sorting");
        System.out.println(rectangles);
    }
}
