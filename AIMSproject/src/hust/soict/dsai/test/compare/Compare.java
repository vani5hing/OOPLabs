package hust.soict.dsai.test.compare;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Compare {

	public static void main(String[] args) {
		Cart cart = new Cart();

		CompactDisc cd1 = new CompactDisc(0, "Album empty 1", "Nhac Pop", null, 0.0f, "The Weekend");
		CompactDisc cd2 = new CompactDisc(0, "Album empty 2", "Nhac Pop", null, 0.0f, "Tuan cui");

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		Book b1 = new Book(0, "Sherlock Holmes", "Truyen trinh tham", 80.25f);
		Book b2 = new Book(0, "So Dua", "Truyen Co Tich", 40.5f);

		cart.addMedia(cd1);
		cart.addMedia(cd2);
		cart.addMedia(dvd1);
		cart.addMedia(dvd2);
		cart.addMedia(b1);
		cart.addMedia(b2);

        cart.sortByCostTitle();
        System.out.println("");
        cart.sortByTitleCost();
	}
}
