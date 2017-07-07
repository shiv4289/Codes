package behavioral.strategy;

public class SubtractOperation implements I_Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}

}
