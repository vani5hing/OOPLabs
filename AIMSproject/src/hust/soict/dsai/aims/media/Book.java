package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	private List<String> authors = new ArrayList<String>();
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)) System.out.println("Author already exists");
		else authors.add(authorName);
	}
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) authors.remove(authorName);
		else System.out.println("Author name doesn't exists");
	}
	public String toString() {
		return "Book - " + this.getTitle() + " - " + this.getCategory() + ": " + this.getCost() + " $";
	}
}
