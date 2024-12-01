package com.jspider.ArrayOfObjects;

public class TextBook {
	int id;
	String title;
	String author;
	int edition;
	double price;
	public TextBook(int id, String title, String author, int edition, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.price = price;
	}
	@Override
	public String toString() {
		return "TextBook [id=" + id + ", title=" + title + ", author=" + author + ", edition=" + edition + ", price="
				+ price + "]";
	}
	

}
