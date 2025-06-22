package teste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DivisaoTeste {
	@Test
    public void testDivisao() {
        assertEquals(2.0, Divisao.calcular(6.0, 3.0));
    }

    @Test
    public void testDivisaoNegativo() {
        assertEquals(-5.0, Divisao.calcular(10.0, -2.0));
    }

    @Test
    public void testDivisaoDecimal() {
        assertEquals(2.5, Divisao.calcular(5.0, 2.0));
    }

    @Test
    public void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            Divisao.calcular(10.0, 0.0);
        });
    }
}
