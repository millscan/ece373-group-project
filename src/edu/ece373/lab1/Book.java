package edu.ece373.lab1;

public class Book {

	private String title;
	private String author;
	private Person person;
	
	public Book() {
		this.title = "unknown";
		this.author = "unknown";
		this.person = null;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
}
