package structural.adapter;

public class VlcPlayer implements I_AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);	
	}

	@Override
	public void playMp4(String filename) {
		// nothing to do
	}

}
