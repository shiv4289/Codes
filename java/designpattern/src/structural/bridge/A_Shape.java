package structural.bridge;

public abstract class A_Shape {
	// Composition
	protected I_Color color;

	public A_Shape(I_Color color){
		this.color = color;
	}

	abstract public void applyColor();
}
