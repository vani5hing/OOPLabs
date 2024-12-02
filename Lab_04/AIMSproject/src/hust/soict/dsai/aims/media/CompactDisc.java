package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public CompactDisc(int id, String title, String category, String director, float cost, String artist) {
		super(id, title, category, director, 0, cost);
		this.artist = artist;
	}
	public void addTrack(Track track) {
		if (tracks.contains(track)) System.out.println("Track already exists");
		else {
			tracks.add(track);
			System.out.println("Added track success");
		}
	}
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Removed track success");
		}
		else System.out.println("Track does not exist");
	}
	public int getLength() {
		int sumLength = 0;
		for (Track track : tracks) {
			sumLength += track.getLength();
		}
		return sumLength;
	}
	public void play() {
		System.out.println("Compactdisc: " + getTitle());
		System.out.println("Artist: " + getArtist());
		System.out.println("Length: " + getLength());
		for (Track track : tracks) {
			track.play();
		}
	}
	public String toString() {
		return "Compact Disc - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getLength() + " - " + this.getArtist() + ": " + this.getCost() + " $";
	}
}
