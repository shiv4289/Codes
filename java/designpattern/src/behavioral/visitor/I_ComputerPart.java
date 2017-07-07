package behavioral.visitor;

public interface I_ComputerPart {
	void accept(I_ComputerPartVisitor visitor);
}
