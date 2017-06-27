package structural.adapter;


public class AudioPlayer implements I_MediaPlayer {

	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		switch(audioType.toLowerCase()){
		case "mp3":
			 System.out.println("Playing mp3 file. Name: " + fileName);
			 break;
		case "mp4":
		case "vlc":
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			break;
		default:
			 System.out.println("Invalid audio type. Name: " + fileName);
		}
	}

}
