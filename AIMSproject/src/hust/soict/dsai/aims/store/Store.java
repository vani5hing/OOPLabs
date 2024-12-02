package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.*;

public class Store {
	private ArrayList<Media> itemsInStore;
	
	public Store() {
		super();
		this.itemsInStore = new ArrayList<Media>(); 
	}
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void printItemsInStore() {
		for (Media media : itemsInStore) {
			System.out.println(media.getId() + ". " + media.toString());
		 }
	}
	
	public void addMedia(Media media) {
		if (itemsInStore.contains(media)) {
			System.out.println("Media already exists");
		}
		else {
			itemsInStore.add(media);
			System.out.println("Added success");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Removed success");
		}
		else {
			System.out.println("Media doen't exist");
		}
	}
}