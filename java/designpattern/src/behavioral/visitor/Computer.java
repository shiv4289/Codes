package behavioral.visitor;

public class Computer implements I_ComputerPart {

	private I_ComputerPart parts[];

	public Computer(){
		parts = new I_ComputerPart[] {new Keyboard(), new Mouse()};
	}

	@Override
	public void accept(I_ComputerPartVisitor visitor) {
		for (int i = 0; i < parts.length; i++){
			parts[i].accept(visitor);
		}
		visitor.visit(this);
	}

}
