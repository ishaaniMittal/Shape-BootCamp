import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IShAani on 28-07-2015.
 */
public class TestClass {

    Rectangle rec = new Rectangle(3,4);
    Square square = new Square(5);

    @Test
    public void testToCalculateAreaOfRectangle(){
        assertEquals(12, rec.calculateArea(),2);
    }

    @Test
    public void testToCalculatePerimeterOfRectangle(){
        assertEquals(14,rec.calculatePerimeter(),2);
    }

    @Test
    public void testToCalculateAreaOfSquare(){
        assertEquals(25,square.calculateArea(),2);
    }

    @Test
    public void testToCalculatePerimeterOfSquare(){
        assertEquals(20,square.calculatePerimeter(),2);
    }
}