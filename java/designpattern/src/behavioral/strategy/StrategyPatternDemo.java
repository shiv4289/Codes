package behavioral.strategy;

public class StrategyPatternDemo {
	public static void main(String argds[]){
		Context context = new Context(new AddOperation());
		System.out.println(context.executeStrategy(4, 2));

		context = new Context(new SubtractOperation());
		System.out.println(context.executeStrategy(4, 2));

		context = new Context(new MultiplyOperation());
		System.out.println(context.executeStrategy(4, 2));
	}
}
