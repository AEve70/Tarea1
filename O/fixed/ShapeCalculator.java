package O.fixed;
import java.util.*;

public class ShapeCalculator {
    
    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        
        for(Shape shape: shapes){
            totalArea += shape.area();
        }

        return totalArea;
    }
}
