import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookItemTest {

    public BookItem bookItem;

    @Before
    public void setUp() {
        bookItem = new BookItem("Effective Java", "Joshua Bloch", "Computer Programming");

    }

    @Test
    public void testBookItemHasAuthor() {
        assertEquals("Joshua Bloch", bookItem.getAuthor());
    }

    @Test
    public void testBookItemHasTitle() {
        assertEquals("Effective Java", bookItem.getTitle());
    }

    @Test
    public void testBookItemHasGenre() {
        assertEquals("Computer Programming", bookItem.getGenre());
    }

}
