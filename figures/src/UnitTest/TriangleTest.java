package UnitTest;

import org.junit.jupiter.api.Test;
import FigurasG.Triangle;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testCalcularArea() {
        Triangle t = new Triangle(2.0, 3.0);
        assertEquals(4.0, t.calculateArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Triangle s = new Triangle(2.0, 3.0);
        assertEquals(8.0, s.getPerimeter(), 0.0001);
    }
}
