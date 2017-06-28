package behavioral.observer;

public class ObserverPatternDemp {
	public static void main(String args[]){
		Subject subject = new Subject();

		new BinaryObserver(subject);
		new HexObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}
}
