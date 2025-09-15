package videosystem;

public class Avengers implements DigitalVideoDisc {
	private static final String title = "Avengers";
	private static final String studio = "Mavel's ";

	@Override
	public String play() {
		return "Playing " + studio + title;
	}

}
