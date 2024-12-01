package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int currentIndex = 0;
	
	public Store(int storeSize) {
		super();
		this.itemsInStore = new DigitalVideoDisc[storeSize]; 
	}
	
	public void printItemsInStore() {
		for (DigitalVideoDisc disc : itemsInStore) {
			 if (disc == null) {
				 break;
			 }
			 else {
				 System.out.println(disc.getId() + ". " + disc.toString());
			 }		 
		 }
	}
	
	public void addDVD(DigitalVideoDisc disc) {
		if (currentIndex < itemsInStore.length) {
			itemsInStore[currentIndex] = disc;
			currentIndex++;
			System.out.println("Added");
		} 
		else {System.out.println("Full");}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		boolean found = false;
		for (int i = 0; i < currentIndex; i++) {
			if (itemsInStore[i].equals(disc)) {
				itemsInStore[i] = itemsInStore[currentIndex - 1];
				itemsInStore[currentIndex - 1] = null;
				currentIndex -= 1;
				i--;
				found = true;
			}
		}
		if (found == true) {
			System.out.println("Removed");
		}
		else {System.out.println("Not found");}
	}
}