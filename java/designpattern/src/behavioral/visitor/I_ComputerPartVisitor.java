package behavioral.visitor;

public interface I_ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
}
