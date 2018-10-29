package learn.microservices.spring.boot.multiplication.domain;

public class Multiplication {

	// Both factors
	private int factorA;
	private int factorB;
	// The result of the operation A * B
	private int result;

	public Multiplication(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = factorA * factorB;
	}

	/**
	 * @return the factorA
	 */
	public int getFactorA() {
		return factorA;
	}

	/**
	 * @return the factorB
	 */
	public int getFactorB() {
		return factorB;
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "Multiplication{" + "factorA=" + factorA + ", factorB=" + factorB + ", result(A*B)=" + result + '}';
	}
}
