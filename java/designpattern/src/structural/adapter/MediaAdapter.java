package structural.adapter;

public class MediaAdapter implements I_MediaPlayer {

	I_AdvancedMediaPlayer advanceMediaPlayer;

	public MediaAdapter(String audioType) {
		switch(audioType.toLowerCase()){
		case "vlc":
			advanceMediaPlayer = new VlcPlayer();
		case "mp4":
			advanceMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		switch(audioType.toLowerCase()){
		case "vlc":
			advanceMediaPlayer.playVlc(fileName);
		case "mp4":
			advanceMediaPlayer.playMp4(fileName);
		}
	}

}
