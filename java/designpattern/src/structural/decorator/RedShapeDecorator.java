package structural.decorator;


public class RedShapeDecorator extends A_ShapeDecorator {

	public RedShapeDecorator(I_Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw(){
		System.out.print("Red border drawn for");
		this.decoratedShape.draw();
	}

}
