package structural.bridge;

public class Pentagon extends A_Shape{

	public Pentagon(I_Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("Pentagon filled with color ");
		color.applyColor();
	}

}
