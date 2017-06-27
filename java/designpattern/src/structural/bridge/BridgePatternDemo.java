// Copied from http://www.journaldev.com/1491/bridge-design-pattern-java

// Example: TV-remote setup: https://dzone.com/articles/design-patterns-bridge

package structural.bridge;

public class BridgePatternDemo {

	public static void main(String[] args) {
		A_Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();

		A_Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}

}
