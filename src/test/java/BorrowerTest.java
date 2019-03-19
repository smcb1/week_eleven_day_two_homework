import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private BookItem bookItem;
    private Borrower borrower;

    @Before
    public void setUp() {
        library = new Library();
        bookItem = new BookItem("Effective Java", "Joshua Bloch", "Computer Programming");
        library.addBook(bookItem);
        borrower = new Borrower();
    }

    @Test
    public void testNewBorrower() {
        assertEquals(0, borrower.getTotalBorrowedBooks());
    }

    @Test
    public void testAddBookToBorrower(){
        library.addBook(bookItem);
        borrower.addBookItemToBorrower(bookItem);
        assertEquals(1, borrower.getTotalBorrowedBooks());
    }

    @Test
    public void testLendBookFromLibrary() {
        library.addBook(bookItem);
        library.addBook(bookItem);
        library.lendBook(bookItem);
        assertEquals(1, library.numberOfBooksInCollection());
    }
}
