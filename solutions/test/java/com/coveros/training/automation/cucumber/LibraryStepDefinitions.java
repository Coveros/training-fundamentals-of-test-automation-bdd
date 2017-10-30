package com.coveros.training.automation.cucumber;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.coveros.training.automation.cucumber.books.Book;
import com.coveros.training.automation.cucumber.books.Library;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LibraryStepDefinitions {

	private Library library = null;

	private List<Book> searchResult;

	@Before
	public void setupScenarios() {
		System.out.println("Initializing library");
		library = new Library();
	}

	@Given("^the list of books in the library$")
	public void addBooksToLibrary(List<Book> books) {
		for (Book book : books) {
			library.addBook(book);
		}
	}

	@Given("^there is a book titled '(.*)' written by '(.*)' published in (\\d+)$")
	public void addBookToLibrary(String title, String author, int yearPublished) throws Throwable {
		library.addBook(new Book(title, author, yearPublished));
	}

	@When("^I search for books published before (\\d+)$")
	public void searchBeforeYear(int endDate) throws Throwable {
		searchResult = new ArrayList<>(library.searchByPublishDate(0, endDate));

	}

	@When("^I search for books published after (\\d+)$")
	public void searchAfterYear(int startDate) throws Throwable {
		searchResult = new ArrayList<>(library.searchByPublishDate(startDate, 0));
	}

	@Then("^(\\d+) books? should be found$")
	public void verifyBooksFound(int count) throws Throwable {
		assertThat(searchResult.size(), equalTo(count));
	}

	@Then("^book (\\d+) should have title '(.*)'$")
	public void verifyBookTitle(int index, String title) {
		Assert.assertEquals(title, searchResult.get(index - 1).getTitle());
	}

	/**
	 * This method is run after each scenario to ensure the library is cleaned up
	 */
	@After
	public final void afterScenario() {
		System.out.println("Cleaning up scenario");
		searchResult = null;
		library = null;
	}

	@When("^I retrieve all books$")
	public void i_retrieve_all_books() throws Throwable {
		searchResult = new ArrayList<>(library.getAllBooks());
	}

}
