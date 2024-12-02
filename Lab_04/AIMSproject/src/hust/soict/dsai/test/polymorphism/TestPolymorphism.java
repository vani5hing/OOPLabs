package hust.soict.dsai.test.polymorphism;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class TestPolymorphism {

	public static void main(String[] args) {
		ArrayList<Media> mediae = new ArrayList<Media>();

		CompactDisc cd1 = new CompactDisc(0, "Album empty", "Nhac Pop", null, 0.0f, "The Weekend");
		CompactDisc cd2 = new CompactDisc(0, "Album empty", "Nhac Pop", null, 0.0f, "Tuan cui");

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		Book b1 = new Book(0, "Sherlock Holmes", "Truyen trinh tham", 80.25f);
		Book b2 = new Book(0, "So Dua", "Truyen Co Tich", 40.5f);

		mediae.add(cd1);
		mediae.add(cd2);
		mediae.add(dvd1);
		mediae.add(dvd2);
		mediae.add(b1);
		mediae.add(b2);

		for (Media media : mediae) {
			System.out.println(media.toString());
		}
	}

}
