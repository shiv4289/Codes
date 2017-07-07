package behavioral.state;

public class StandByState implements I_State {

	@Override
	public void pressPlay(MP3PlayerContext context) {
		context.setState(new PlayingState());
	}

	public String toString(){
		return "stand by state";
	}
}
