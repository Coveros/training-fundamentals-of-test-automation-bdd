@qatests
Feature: Searching the library

  As a library user
  I want to search the library
  So that I can find the books that I want
  	
  Background: 
    Given there is a book titled 'A Brief History of Time' written by 'Stephen Hawking' published in 1988
    And there is a book titled 'War and Peace' written by 'Leo Tolstoy' published in 1869
    And there is a book titled 'The Cat in the Hat' written by 'Dr Seuss' published in 1957

  Scenario: Search for books earlier than a particular date
    When I search for books published before 1900
    Then 1 book should be found
    And book 1 should have title 'War and Peace'
    