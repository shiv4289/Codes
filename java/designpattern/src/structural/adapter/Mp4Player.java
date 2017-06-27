package structural.adapter;

public class Mp4Player implements I_AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// nothing to do

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);	
	}

}
