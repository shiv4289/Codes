package behavioral.visitor;

public class Mouse implements I_ComputerPart {

	@Override
	public void accept(I_ComputerPartVisitor visitor) {
		visitor.visit(this);
;	}

}
