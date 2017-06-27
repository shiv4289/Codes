package structural.decorator;

public abstract class A_ShapeDecorator {
	protected I_Shape decoratedShape;

	public A_ShapeDecorator(I_Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw(){
		decoratedShape.draw();
	}
}
