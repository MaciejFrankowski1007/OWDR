package org.example.Library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book1 = new Book("Harry Potter", "J.K. Rowling", 1997, true);
        book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937,true);
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void testSearchByTitle_ExistingBook(){
        List<Book> results = library.searchByTitle("Harry Potter");
        assertEquals(1, results.size()); //Sprawdza, czy znaleziono dokładnie jedną książkę
        assertEquals("Harry Potter", results.get(0).getTitle());
    }

    @Test
    public void testSearchByTitle_NonExistingBook(){
        List<Book> results = library.searchByTitle("Harry Potte");
        assertTrue(results.isEmpty()); //Sprawdza, czy lista jest pusta
    }

    @Test
    public void testSearchByTitle_EmptyTitle(){
        List<Book> results = library.searchByTitle("");
        assertTrue(results.isEmpty()); //Sprawdza, czy lista jest pusta
    }

    @Test
    public void testSearchByTitle_NullTitle(){
        List<Book> results = library.searchByTitle(null);
        assertTrue(results.isEmpty()); //Sprawdza, czy lista jest nullem
    }

    @Test
    public void testLibraryWithNoBooks(){
        Library emptyLibrary = new Library();
        List<Book> results = emptyLibrary.searchByTitle("Title");
        assertTrue(results.isEmpty()); //Sprawdza, czy lista jest pusta
    }

    @Test
    public void testBorrowBook_AvaliableBook(){
        //Given
        assertTrue(book1.isAvailable());
        //When
        boolean success = library.borrowBook("Harry Potter", "J.K. Rowling");
        //Then
        assertTrue(success);
        assertFalse(book1.isAvailable());
    }

    @Test
    public void testBorrowBook_UnavalableBook(){
        //Given
        library.borrowBook("The Hobbit", "J.R.R. Tolkien");
        assertFalse(book2.isAvailable());
        //When
        boolean success = library.borrowBook("The Hobbit", "J.R.R. Tolkien");
        //Then
        assertFalse(success);
    }

    @Test
    public void testReturnBook(){
        //Given
        library.borrowBook("Harry Potter", "J.K. Rowling");
        assertFalse(book1.isAvailable());
        //When
        library.returnBook(book1);
        //Then
        assertTrue(book1.isAvailable());
    }

    @Test
    public void testBorrowBook_NonExistBook(){
        //When
        boolean success = library.borrowBook("Harry Potte", "J.K. Rowling");
        //Then
        assertFalse(success);
    }

}