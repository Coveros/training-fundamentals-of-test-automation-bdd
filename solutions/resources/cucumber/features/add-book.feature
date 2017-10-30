@qatests
Feature: Add books to the library

Scenario: Add a single book to the library
	Given there is a book titled 'War and Peace' written by 'Leo Tolstoy' published in 1869
	When I retrieve all books
	Then 1 book should be found
    And book 1 should have title 'War and Peace'
	