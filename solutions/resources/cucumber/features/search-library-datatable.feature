## Answer to Activity 4
Feature: Searching the library

  Background: 
    Given the list of books in the library
    |title                    |author           |published|
    |A Brief History of Time  |Stephen Hawking  |1988|
    |War and Peace            |Leo Tolstoy      |1869|
    |The Cat in the Hat       |Dr Seuss         |1957|

  Scenario: Search for books earlier than a particular date
    When I search for books published before 1900
    Then 1 book should be found
    And book 1 should have title 'War and Peace'

  Scenario: Search for books later than a particular date
    When I search for books published after 1900
    Then 2 books should be found
    And book 1 should have title 'The Cat in the Hat'
    And book 2 should have title 'A Brief History of Time'