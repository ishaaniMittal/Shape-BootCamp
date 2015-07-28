import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IShAani on 28-07-2015.
 */
public class RectangleTestClass {

    Rectangle rec = new Rectangle(3,4);

    @Test
    public void testToCalculateAreaOfRectangle(){
        assertEquals(12,rec.calculateArea(rec));
    }

}