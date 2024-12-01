package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.disc.*;

public class Aims {
	public static void main(String[] args){
		Cart anOrder = new Cart();
		// test add new dvd
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", " George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		//test if maximum cart is 20
		DigitalVideoDisc dvdtest = new DigitalVideoDisc("Sicario", "Action", 10f);
		for(int i = 1; i <= 20; i++) anOrder.addDigitalVideoDisc(dvdtest);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		// test remove dvd (all duplicate)
		anOrder.removeDigitalVideoDisc(dvdtest);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		// test add dvd by list
		DigitalVideoDisc [] dvdList = {dvd1, dvd1, dvd2, dvd2, dvd3, dvd3};
		anOrder.addDigitalVideoDisc(dvdList);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		// test add 2 dvd parameter
		anOrder.addDigitalVideoDisc(dvd1, dvd3);
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
	}
	
}
