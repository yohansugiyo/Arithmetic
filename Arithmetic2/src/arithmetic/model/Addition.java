package arithmetic.model;

public class Addition implements ArithmeticOperation {

	@Override
	public double compute(double a, double b) {
		return a + b;
	}

	@Override
	public char getSign() {
		return '+';
	}

}
