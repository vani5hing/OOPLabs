package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ODERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ODERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBER_ODERED) {
			System.out.println("The cart is already full");
		}
		else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].equals(disc)) {
				itemsOrdered[i] = itemsOrdered[qtyOrdered - 1];
				itemsOrdered[qtyOrdered - 1] = null;
				qtyOrdered -= 1;
				i--;
			}
			// O(n) complexity
		}
		System.out.println("Remove success");
	}
	public float totalCost() {
		float res = 0;
		for(int i = 0; i < qtyOrdered; i++) res += itemsOrdered[i].getCost();
		return res;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for(DigitalVideoDisc disc : dvdList) {
			if(qtyOrdered == MAX_NUMBER_ODERED) {
				System.out.println("The cart is already full");
				return;
			}
			else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered += 1;
				System.out.println("The disc " + disc.getTitle() + " has been added");
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if(qtyOrdered == MAX_NUMBER_ODERED) {
			System.out.println("The cart is already full");
			return;
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;
			System.out.println("The disc " + dvd1.getTitle() + " has been added");
		}
		if(qtyOrdered == MAX_NUMBER_ODERED) {
			System.out.println("The cart is already full");
		}
		else {
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered += 1;
			System.out.println("The disc " + dvd2.getTitle() + " has been added");
		}
	}
	
	 public void print_cart() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 System.out.println("Total cost: " + totalCost());
				 break;
			 }
			 else {
				 System.out.println(disc.getId() + ". " + disc.toString());
			 }		 
		 }
	 }
	 
	 public void idSearch(int id) {
		 boolean found = false;
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 else if (disc.getId() == id) {
				 System.out.println("Found: " + disc.toString());
				 found = true;
				 break;
			 } 
		 }
		 if (found == false) {
			 System.out.println("No match is found");
			 }
	 }
	 
	 public void titleSearch(String title) {
		 boolean found = false;
		 for (DigitalVideoDisc disc : itemsOrdered) {
			 if (disc == null) {
				 break;
			 }
			 else if(disc.isMatch(title)) {
				 System.out.println("Found: " + disc.toString());
				 found = true;
			 }
		 }

		 if (found == false) {
			 System.out.println("No match is found");
			 }
	 }
}
