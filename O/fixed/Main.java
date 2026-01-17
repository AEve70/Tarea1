package O.fixed;

import java.util.*;

public class Main {
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(5))
    shapes.add(new Rectangle(4, 6)); 

    ShapeCalculator calculator = new ShapeCalculator();
    
    System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
}
