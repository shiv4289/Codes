package behavioral.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		MP3PlayerContext context = new MP3PlayerContext();

		StandByState standBy = new StandByState();
		standBy.pressPlay(context);
		System.out.println(context.getState().toString());

		PlayingState playing = new PlayingState();
		playing.pressPlay(context);
		System.out.println(context.getState().toString());
	}

}
