import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    public Library library;
    private BookItem book;
    private BookItem book1;


    @Before
    public void setUp() {
        library = new Library();
        book = new BookItem("Effective Java", "Joshua Bloch", "Computer Programming");
        book1 = new BookItem("Thinking in Java", "Bruce Eckel", "Computer Programming");
    }

    @Test
    public void testCollectionIsEmpty() {
        assertEquals(0, library.numberOfBooksInCollection());
    }

    @Test
    public void testCollectionCapacity() {
        assertEquals(2, library.collectionCapacity());
    }

    @Test
    public void testAddBookToCollectionSuccess() {
        library.addBook(book);
        assertEquals(1, library.numberOfBooksInCollection());
    }

    @Test
    public void testAddBookToCollectionFail() {
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book);
        assertEquals(2, library.numberOfBooksInCollection());
    }

    @Test
    public void testLendBookToBorrower(){
        library.addBook(book);
        library.addBook(book1);
        library.lendBook(book);
        assertEquals(1, library.numberOfBooksInCollection());
    }

}
