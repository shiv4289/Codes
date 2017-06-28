package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<A_Observer> observers= new ArrayList<A_Observer>();
	private int state;

	public int getState(){
		return state;
	}

	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}

	private void notifyAllObservers() {
		for (A_Observer observer : observers){
			observer.update();
		}
	}

	public void attach(A_Observer observer){
		observers.add(observer);
	}

}
