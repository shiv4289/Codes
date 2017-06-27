package structural.bridge;

public class Triangle extends A_Shape{

	public Triangle(I_Color color){
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle filled with color ");
		color.applyColor();
	}
	
}
