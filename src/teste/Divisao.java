package teste;

	public class Divisao {
	    public static double calcular(double a, double b) {
	        if (b == 0) {
	            throw new ArithmeticException("Divisão por zero não é permitida.");
	        }
	        return a / b;
	    
}
	    }

