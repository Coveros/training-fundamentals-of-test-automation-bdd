package com.coveros.training.automation.cucumber.books;

/**
 * Simple class representing a book that will be in the library
 * 
 * @author brian
 *
 */
public final class Book {

	private String title;
	private String author;
	private int published;

	/**
	 * Create a new book
	 * 
	 * @param title
	 *            the title of the book
	 * @param author
	 *            the author of the book
	 * @param yearPublished
	 *            the year that the book was published
	 */
	public Book(String title, String author, int yearPublished) {
		super();
		this.title = title;
		this.author = author;
		this.published = yearPublished;
	}

	/**
	 * 
	 * @return the title of the book
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @return the author of the book
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * 
	 * @return the year in which the book was published
	 */
	public int getPublished() {
		return published;
	}

}
