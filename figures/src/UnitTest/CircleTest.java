package UnitTest;
import FigurasG.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCalcularArea() {
        Circle c = new Circle(1.0);
        assertEquals(Math.PI, c.calculateArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Circle c = new Circle(1.0);
        assertEquals(2 * Math.PI, c.getPerimeter(), 0.0001);
    }
}
