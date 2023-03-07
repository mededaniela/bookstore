package sof3as3.kirja.Bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String title;
	private String author;
	private int publishing_year;
	private String isbn;
	private double price;
	
	//konstruktorit
	public Book() {
		super();
		this.id = null;
		this.title = null;
		this.author = null;
		this.publishing_year = 0;
		this.isbn = null;
		this.price = 0.0;
		
	}
	public Book(String title, String author, int publishing_year) {
		super();
		this.title = title;
		this.author = author;
		this.publishing_year = publishing_year;
	}
	
	public Book(Long id, String title, String author, int publishing_year) {
		super();
		this.id = id;
		this.title = title;
		this.publishing_year = publishing_year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishingYear() {
		return publishing_year;
	}

	public void setPublishingYear(int publishing_year) {
		this.publishing_year = publishing_year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// toString	
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author +  ", publishing_year=" + publishing_year + "]";
		}
	
	
	
	
}
