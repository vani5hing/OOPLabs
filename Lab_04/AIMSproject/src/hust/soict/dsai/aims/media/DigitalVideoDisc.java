package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	private static int nbDigitalVideoDiscs = 0;
	
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs, title, "", "", 0, 0.0f);
		nbDigitalVideoDiscs += 1;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super(nbDigitalVideoDiscs, title, category, "", 0, cost);
		nbDigitalVideoDiscs += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(nbDigitalVideoDiscs, title, category, director, 0, 0.0f);
		nbDigitalVideoDiscs += 1;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDiscs, title, category, director, length, cost);
		nbDigitalVideoDiscs += 1;
	}
	
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + ": " + this.getCost() + " $";
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

}
