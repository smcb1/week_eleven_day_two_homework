import java.util.ArrayList;

public class Library {

    private int libraryCapacity;
    private ArrayList<BookItem> booksCollection;

    public Library() {
        this.libraryCapacity = 2;
        this.booksCollection = new ArrayList<BookItem>();
    }

    public ArrayList<BookItem> getBooksCollection() {
        return booksCollection;
    }

    public int numberOfBooksInCollection() {
        return this.booksCollection.size();
    }

    public void addBook(BookItem bookItem) {
        if (numberOfBooksInCollection() < collectionCapacity())
            this.booksCollection.add(bookItem);
    }

    public int collectionCapacity() {
        return this.libraryCapacity;
    }


    public BookItem lendBook(BookItem bookItem) {
        this.booksCollection.remove(bookItem);
        return bookItem;
    }
}
