package behavioral.observer;

public class HexObserver extends A_Observer {

	public HexObserver(Subject subject){
		this.subject = subject;
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ) );
	}

}
