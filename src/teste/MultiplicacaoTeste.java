package teste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class MultiplicacaoTeste {
	 @Test
	    public void testMultiplicacao() {
	        assertEquals(15.0, Multiplicacao.calcular(5.0, 3.0));
	    }

	    @Test
	    public void testMultiplicacaoPorZero() {
	        assertEquals(0.0, Multiplicacao.calcular(10.0, 0.0));
	    }

	    @Test
	    public void testMultiplicacaoNegativo() {
	        assertEquals(-12.0, Multiplicacao.calcular(-3.0, 4.0));
	    }
}
