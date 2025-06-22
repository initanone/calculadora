package teste;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class SubtracaoTeste {
	 @Test
	    public void testSubtracao() {
	        assertEquals(2.0, Subtracao.calcular(5.0, 3.0));
	    }

	    @Test
	    public void testSubtracaoNegativos() {
	        assertEquals(0.0, Subtracao.calcular(-5.0, -5.0));
	    }

	    @Test
	    public void testSubtracaoComZero() {
	        assertEquals(7.0, Subtracao.calcular(7.0, 0.0));
	    } 
}
