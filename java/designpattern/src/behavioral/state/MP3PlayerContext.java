package behavioral.state;

public class MP3PlayerContext {
	private I_State state;

	public MP3PlayerContext() {
		state = null;
	}

//	public void pressPlay(){
//		state.pressPlay(this);
//	}

	public void setState(I_State state){
		this.state = state;
	}

	public I_State getState(){
		return state;
	}
}
