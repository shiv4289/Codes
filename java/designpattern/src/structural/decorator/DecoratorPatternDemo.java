package structural.decorator;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();

		RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();

		RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		redRectangle.draw();
	}

}
