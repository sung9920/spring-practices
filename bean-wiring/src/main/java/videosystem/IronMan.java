package videosystem;

public class IronMan implements DigitalVideoDisc {
	private static final String title = "IronMan";
	private static final String studio = "Marvel's ";

	@Override
	public String play() {
		return "Playing " + studio + title;
	}

}
