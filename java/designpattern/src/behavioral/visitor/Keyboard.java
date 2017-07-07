package behavioral.visitor;

public class Keyboard implements I_ComputerPart {

	@Override
	public void accept(I_ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
