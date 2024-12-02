package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.*;

public class Cart {
	public static final int MAX_NUMBER_ODERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if ((itemsOrdered.size()) >= MAX_NUMBER_ODERED) {
			System.out.println("Full");
		}
		else if (itemsOrdered.contains(media)) {
			System.out.println("Media already exists");
		}

		else {
			itemsOrdered.add(media);
			System.out.println("Added success");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Removed success");
		}
		else {
			System.out.println("Media doesn't exist");
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}	
		return totalCost;
	}
	
	 public void print_cart() {
		 System.out.println("***********************CART***********************");
		 System.out.println("Ordered Items:");
		 for (Media media : itemsOrdered) {
			 System.out.println(media.toString());
		}		 
		 System.out.println("Total cost: " + totalCost());
	 }
	 
	 public void idSearch(int id) {
		 boolean found = false;
		 for (Media media : itemsOrdered) {
			 if (media.getId() == id) {
				 System.out.println("Found: " + media.toString());
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
		 for (Media media : itemsOrdered) {
			 if(media.isMatch(title)) {
				 System.out.println("Found: " + media.toString());
				 found = true;
			 }
		 }
		 if (found == false) {
			 System.out.println("No match is found");
		 }
	 }
	 
	 public void sortByCostTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
		System.out.println("Sorted by Cost >> Title:");
		itemsOrdered.forEach(System.out::println);
	}

	public void sortByTitleCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
		System.out.println("Sorted by Title >> Cost:");
		itemsOrdered.forEach(System.out::println);
	}

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
}
