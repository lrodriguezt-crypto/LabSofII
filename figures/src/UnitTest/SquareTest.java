package UnitTest;
import org.junit.jupiter.api.Test;
import FigurasG.Square;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void testCalcularArea() {
        Square s = new Square(2.0);
        assertEquals(4.0, s.calculateArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Square s = new Square(2.0);
        assertEquals(8.0, s.getPerimeter(), 0.0001);
    }
    
}
