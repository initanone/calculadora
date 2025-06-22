package teste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomaTeste {

    @Test
    public void testSomaPositivos() {
        assertEquals(8.0, Soma.calcular(5.0, 3.0));
    }

    @Test
    public void testSomaNegativos() {
        assertEquals(-10.0, Soma.calcular(-5.0, -5.0));
    }

    @Test
    public void testSomaZero() {
        assertEquals(4.0, Soma.calcular(4.0, 0.0));
    }
}
