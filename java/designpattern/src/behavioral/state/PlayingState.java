package behavioral.state;

public class PlayingState implements I_State {

	@Override
	public void pressPlay(MP3PlayerContext context) {
		context.setState(new StandByState());
	}

	public String toString(){
		return "In palying state";
	}
}
